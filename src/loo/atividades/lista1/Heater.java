package loo.atividades.lista1;

/**
 * @author Matheus Rocha
 * @version 1.0
 */

public class Heater {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    /**
     * @param min, the lower temperature that the heat can go
     * @param max, the higher temperature that the heat can go
     */

    public Heater(int min, int max) {
        this.temperature = 15;
        this.increment = 5;

        this.min = min;
        this.max = max;
    }

    /*
    * Increases temperature
    */

    public void warmUp() {
        if(this.temperature + this.increment > this.max) {
            System.out.println("[ERRO] - Temperatura máxima excedida: " + this.max);
        } else {
            this.temperature += this.increment;
        }
    }

     /*
     * Decreases temperature
     */

    public void cool(){
        if(this.temperature - this.increment < this.min) {
            System.out.println("[ERRO] - Temperatura mínima excedida: " + this.min);
        } else {
            this.temperature -= this.increment;
        }
    }
    /*
    @return Current temperature
     */
    public int getTemperature() {
        return this.temperature;
    }

    /**
     *
     * @param increment, Changes the heater increment value
     */

    public void setIncrement(int increment) {
            if(increment < 1) {
                System.out.println("[ERRO] - O valor forncecido deve ser maior que 0");
            } else {
                this.increment = increment;
            }
    }
}
