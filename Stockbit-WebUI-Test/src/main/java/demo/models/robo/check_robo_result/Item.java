
package demo.models.robo.check_robo_result;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Item {

    private List<Asset> asset;
    private Aum aum;
    private List<Bank> bank;
    private Cagr cagr;
    private Changesvalue changesvalue;
    @JsonProperty("custodian_bank")
    private CustodianBank custodianBank;
    private Boolean etf;
    private Expenseratio expenseratio;
    private Fee fee;
    private Files files;
    private List<Holding> holding;
    private Long id;
    private Boolean index;
    @JsonProperty("investment_manager")
    private InvestmentManager investmentManager;
    private Maxdrawdown maxdrawdown;
    private Long minbuy;
    private Long minsell;
    private String name;
    private Nav nav;
    private String profile;
    private String riskprofile;
    private String robocategory;
    private List<Object> shareholders;
    private Boolean sharia;
    private Simplereturn simplereturn;
    private String symbol;
    private Long tradeable;
    private String type;

}
