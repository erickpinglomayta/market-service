package pe.com.bank.market.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pe.com.bank.market.document.MarketDocument;
import pe.com.bank.market.repositorty.MarketRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class MarketServiceImpl implements MarketService{
	
	
	MarketRepository marketRepository;
	
	public Flux<MarketDocument> getAllMarket(){
		return marketRepository.findAll();
	}
	
	public Mono<MarketDocument> getMarketById(String marketDocumentId){
		return marketRepository.findById(marketDocumentId);
	}
	public Mono<MarketDocument> saveMarket(MarketDocument marketDocument){
		return marketRepository.save(marketDocument);
	}
	public Mono<MarketDocument> updateMarketById(MarketDocument marketDocument,String marketDocumentId){
		return null;
	}
	public Mono<Void> deleteMarketById(String marketDocumentId){
		return marketRepository.deleteById(marketDocumentId);
	}

}
