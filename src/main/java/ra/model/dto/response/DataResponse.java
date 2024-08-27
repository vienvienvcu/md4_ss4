package ra.model.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DataResponse {
    private Object content;
    private HttpStatus httpStatus;
}
