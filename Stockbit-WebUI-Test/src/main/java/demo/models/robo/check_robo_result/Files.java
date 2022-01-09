
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
public class Files {

    private List<Factsheet> factsheets;
    private List<Prospectus> prospectus;

}
