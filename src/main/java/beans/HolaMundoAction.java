package beans; /** paquete al que pertenece esta clase*/
import org.apache.logging.log4j.LogManager; /**  Importa la clase LogManager  */
import org.apache.logging.log4j.Logger; /** Importa la interfaz Logger de Log4j */
/**
 *
 * @author dayan
 */
public class HolaMundoAction { /** Declara la clase pública */

    Logger log = LogManager.getLogger(HolaMundoAction.class); /** permite registrar mensajes relacionados con esta clase */

    private String saludosAtr; /** se utilizará para almacenar un mensaje que se quiere mostrar en la vista */

    public String execute() { /** valor de retorno de este método determina el resultado de la acción, como la navegación a una vista específica */
        log.info("ejecutandometodo execute desde struts2"); /** Este mensaje aparecerá en el registro de la aplicación y es útil para depurar o rastrear la ejecución del método execute */
        this.saludosAtr = "Hola desde Struts2"; /** establece el mensaje que se quiere mostrar en la vista a través de la acción Struts 2 */
        return "exito"; /** resultado de la acción */
    }

    public String getSaludosAtr() { /** método de acceso (getter) */
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) { /** método de acceso (setter) */
        this.saludosAtr = saludosAtr;
    }

}
