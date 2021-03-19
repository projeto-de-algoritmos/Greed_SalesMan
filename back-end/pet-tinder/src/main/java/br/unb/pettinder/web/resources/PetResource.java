package br.unb.pettinder.web.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unb.pettinder.entities.Pet;
import br.unb.pettinder.services.PetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pets")
public class PetResource {

  @Autowired
  private PetService service;

  @GetMapping()
  public List<Pet> getAll() {
    return this.service.getAll();
  }

  @PostMapping()
  public Pet create(@RequestBody Pet pet) {
    return this.service.create(pet);
  }


  @GetMapping("/dijkstra/{from}/{to}")
  public List<Pet> getDijkstra(@PathVariable Integer from,@PathVariable Integer to ) {
      return this.service.useDijkstra(from, to);
  }

}
