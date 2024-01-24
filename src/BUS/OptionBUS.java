package BUS;

import DTO.Foods;

import java.util.ArrayList;

public class OptionBUS {
    private final ArrayList<Foods> listFoods;

    public OptionBUS() {
        listFoods = new ArrayList<>();
        this.setData();
    }

    public void setData() {
        listFoods.add(new Foods("Nuoc lanh", "5000"));
        listFoods.add(new Foods("Nuoc nong", "5000"));
        listFoods.add(new Foods("Nuoc ngot", "15000"));
    }

    public ArrayList<Foods> getData() {
        return listFoods;
    }

    public Foods getItemValue(String name) {
        for (Foods item : listFoods) {
            if (item.getName().equals(name)) return item;
        }
        return null;
    }
}
