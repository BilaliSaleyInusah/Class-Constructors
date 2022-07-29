public class Car {
    private int door;
    private int wheel;
    private String model;
    private String egine;
    private String color;

    public void setModel(String model){
        String valideModel = model.toLowerCase();
        if (valideModel.equals("carrera") || valideModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        
    }

    public String getModel(){
        return this.model;
    }

}
