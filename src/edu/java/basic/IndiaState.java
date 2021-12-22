package edu.java.basic;

public enum IndiaState {
    AndhraPradesh("Amaravati"),
    ArunachalPradesh("Itanagar"),
    Assam("Dispur"),
    Bihar("Patna"),
    Chhattisgarh("Raipur"),
    Goa("Panaji"),
    Gujarat("Gandhinagar"),
    Haryana("Chandigarh"),
    HimachalPradesh("Shimla"),
    Jharkhand("Ranchi"),
    Karnataka("Bengaluru"),
    Kerala("Thiruvananthapuram"),
    MadhyaPradesh("Bhopal"),
    Maharashtra("Mumbai"),
    Manipur("Imphal"),
    Meghalaya("Shillong"),
    Mizoram("Aizawl"),
    Nagaland("Kohima"),
    Odisha("Bhubaneswar"),
    Punjab("Chandigarh"),
    Rajasthan("Jaipur"),
    Sikkim("Gangtok"),
    TamilNadu("Chennai"),
    Telangana("Hyderabad"),
    Tripura("Agartala"),
    UttarPradesh("Lucknow"),
    Uttarakhand("Dehradun (Winter) Gairsain (Summer)"),
    WestBengal("Kolkata");

    String capital;

    IndiaState(String capital) {
        this.capital = capital;
    }
    public String getCapital(){
        return this.capital;
    }
}
