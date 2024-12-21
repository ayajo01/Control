package ma.xproce.controlaya.dto;
import lombok.Builder;

import java.util.Date;
@Builder
public class BookDto {
    private String titre;
    private String publisher;
    private Date datePublication;
    private float price;
    private String resume;
}
