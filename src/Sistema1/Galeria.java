package Sistema1;

import java.time.LocalDateTime;

public class Galeria {
    public String Adquisicion;
    public LocalDateTime fechaLimite;

    public Galeria(String adquisicion, LocalDateTime fechaLimite) {
        Adquisicion = adquisicion;
        this.fechaLimite = fechaLimite;
    }

    public String getAdquisicion() {
        return Adquisicion;
    }

    public LocalDateTime getFechaLimite() {
        return fechaLimite;
    }
}
