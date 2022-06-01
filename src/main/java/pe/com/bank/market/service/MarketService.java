package pe.com.bank.market.service;

import pe.com.bank.market.document.MarketDocument;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MarketService {
	
	public Flux<MarketDocument> getAllMarket();
	public Mono<MarketDocument> getMarketById(String marketDocumentId);
	public Mono<MarketDocument> saveMarket(MarketDocument marketDocument);
	public Mono<MarketDocument> updateMarketById(MarketDocument marketDocument,String marketDocumentId);
	public Mono<Void> deleteMarketById(String marketDocumentId);

}
