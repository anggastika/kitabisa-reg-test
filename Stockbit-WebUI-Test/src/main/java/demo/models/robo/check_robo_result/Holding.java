
package demo.models.robo.check_robo_result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Holding {

    private Long annualDividend;
    private String date;
    private String name;
    private String symbol;

}
