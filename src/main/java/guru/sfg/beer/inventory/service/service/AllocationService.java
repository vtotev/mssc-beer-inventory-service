package guru.sfg.beer.inventory.service.service;

import guru.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
