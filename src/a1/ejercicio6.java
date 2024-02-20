package a1;

public class ejercicio6 {
    String nombre;
    String rector;
    String ciudad;

    class Facultad {
        String nombre;
        int codigo;
    }

    class Profesor {
        String profesion;
        String nacionalidad;
        double sueldo;
    }

    class Carrera {
        String nombre;
        int creditos;
        int semestres;
        int nivel;
        Facultad facultad;
    }

    class Estudiante {
        String colegio;
        Fecha ingreso_uni;
        List<Carrera> carreras;
    }

    class Curso {
        int codigo;
        String nombre;
        int creditos;
        int salon;
        String edificio;
        List<Profesor> profesores;
        List<Estudiante> estudiantes;
        Carrera carrera;
    }
}

enum NivelCarrera {
    PREGRADO, POSTGRADO

}
