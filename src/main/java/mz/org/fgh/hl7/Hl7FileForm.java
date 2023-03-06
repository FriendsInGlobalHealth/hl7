package mz.org.fgh.hl7;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Hl7FileForm {
    @NotBlank(message = "{hl7.validation.fileform.email.NotBlank.message}")
    @Email(message = "{hl7.validation.fileform.email.Email.message}")
    private String email;

    @NotBlank(message = "{hl7.validation.fileform.filename.NotBlank.message}")
    @Pattern(regexp= "^[a-zA-Z0-9 _]*$", message="{hl7.validation.fileform.filename.Pattern.message}")
    private String filename;

    private Location province;
    private Location district;

    @NotNull(message = "{hl7.validation.fileform.healthFacilities.Size.message}")
    @Size(min = 1, message = "{hl7.validation.fileform.healthFacilities.Size.message}")
    private List<Location> healthFacilities;
}
