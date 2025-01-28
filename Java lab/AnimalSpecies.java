public class AnimalSpecies {
    private String name;
    private int population;
    private double growthRate;

    public AnimalSpecies(String name, int population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }
    public AnimalSpecies() {
        this.name = "";
        this.population = 0;
        this.growthRate = 0.0;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public double getGrowthRate() {
        return growthRate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }
    @Override
    public String toString() {
        return "AnimalSpecies [name = " + name + ", population = " + population, "Growth Rate = " + growthRate + "%";
    }
    @Override
    public boolean equals(Object obj) {
        //UNFINISHED
    }

}