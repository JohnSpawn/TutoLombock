package john.spawn.hellteam.tuto.lombok;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * User class
 */
@Getter // Initialize all getters
@Setter // Initialize all setters
@Accessors(prefix = "_")    // Remove '_' for access
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder    // To specific constructor
@ToString
@EqualsAndHashCode
public class UserBean {

    private Integer _age;
    private String _nom;
    private String _prenom;
    private static int bpm;
}
