package org.entdes.todolist;

/**
 * La clase `Tasca` representa una tarea dentro de una lista de tareas. Cada tarea tiene una descripción y un estado
 * que indica si está completada o pendiente.
 */
public class Tasca {

    // Variable que indica si la tarea está completada. Por defecto, es false (pendiente).
    private boolean completada = false;

    // Descripción de la tarea.
    private String descripcio;

    /**
     * Constructor de la clase `Tasca`.
     *
     * @param descripcio Descripción de la tarea.
     */
    public Tasca(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * Devuelve el estado de la tarea.
     *
     * @return `true` si la tarea está completada, `false` si está pendiente.
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Permite establecer el estado de la tarea como completada o pendiente.
     *
     * @param completada `true` para marcar la tarea como completada, `false` para marcarla como pendiente.
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    /**
     * Devuelve la descripción de la tarea.
     *
     * @return la descripción de la tarea.
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Devuelve una representación en forma de cadena de la tarea.
     *
     * @return La descripción de la tarea junto con su estado ("Completada" o "Pendent").
     */
    @Override
    public String toString() {
        return descripcio + ": " + (completada ? "Completada" : "Pendent");
    }
}