package com.pokemon.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

//make appropriate methods transactional after
@Service
public class PokemonService implements IPokemonService {
   
    @Autowired
    private PokemonRepository repository;

    @Override
    public List<Pokemon> find() {
        return repository.findAllByOrderIdAsc();
    }

    @Override
    public Pokemon create(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    @Override
    public Pokemon update(Long id, int quantity) {
        try {
            Pokemon existingPokemon = repository.findById(id).get();
            existingPokemon.setQuantity(quantity);
            return repository.save(existingPokemon);
        }
        catch(Exception e) {
            System.err.println(e);
            return null;
        }
              
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    
}
