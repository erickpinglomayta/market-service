package pe.com.bank.market.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pe.com.bank.market.document.MarketDocument;
import pe.com.bank.market.service.MarketService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RequestMapping("/v1")
@RestController
public class MarketController {
	
	MarketService marketService;
	
	@GetMapping("/getAllMarket")
	public Flux<MarketDocument> getAllMarket(){
		return marketService.getAllMarket();
	}
	
	@GetMapping("/getMarketById/{marketDocumentId}")
	public Mono<MarketDocument> getMarketById(@PathVariable String marketDocumentId){
		return marketService.getMarketById(marketDocumentId);
	}
	
	@PostMapping("/saveMarket")
	public Mono<MarketDocument> saveMarket(@RequestBody MarketDocument marketDocument){
		return marketService.saveMarket(marketDocument);
	}
	
	@PutMapping("/updateMarketById/{marketDocumentId}")
	public Mono<MarketDocument> updateMarketById(@RequestBody MarketDocument marketDocument,@PathVariable String marketDocumentId){
		return marketService.updateMarketById(marketDocument,marketDocumentId);
	}
	
	@DeleteMapping("/marketDocumentId/{marketDocumentId}")
	public Mono<Void> deleteMarketById(@PathVariable String marketDocumentId){
		return marketService.deleteMarketById(marketDocumentId);
	}

}
