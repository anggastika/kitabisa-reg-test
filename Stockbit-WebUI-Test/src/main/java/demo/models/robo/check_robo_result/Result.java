
package demo.models.robo.check_robo_result;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Result {

    private Recommendation recommendation;
    private Long score;
    private List<String> sequence;

}
