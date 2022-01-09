
package demo.models.robo.check_robo_result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@Builder
@SuppressWarnings("unused")
public class Data {

    private Long categoryid;
    private Result result;
    private String roboid;

}
