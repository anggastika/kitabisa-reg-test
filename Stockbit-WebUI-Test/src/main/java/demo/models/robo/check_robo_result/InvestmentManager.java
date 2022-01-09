
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
public class InvestmentManager {

    private String email;
    private String fax;
    private String fee;
    private String name;
    private String ojkCode;
    private String telepon;
    private String url;

}
