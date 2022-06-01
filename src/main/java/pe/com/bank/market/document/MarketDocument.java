package pe.com.bank.market.document;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "market")
public class MarketDocument {
	
	@Id
	private String marketId;
	private String status;
	private Double minimumAmount;
	private Double maximunAmount;
	@CreatedDate
	private Date publicationDate;
	private Date endDate;
	private String sellerBootcoinWalletId;

}
