
package demo.models.robo.check_robo_result;

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
public class Changesvalue {

    @JsonProperty("1d")
    private Double d;
    @JsonProperty("1m")
    private Double m;
    @JsonProperty("1y")
    private Double y;
    private Double ytd;

}
