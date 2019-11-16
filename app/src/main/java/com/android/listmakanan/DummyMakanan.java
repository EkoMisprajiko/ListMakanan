package com.android.listmakanan;

import java.util.ArrayList;

public class DummyMakanan {
    public static ArrayList<Makanan> listMakanan(){
        ArrayList<Makanan> makanan = new ArrayList<>();
        makanan.add(new Makanan(1, R.drawable.ayam, "Ayam Goreng","Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(2, R.drawable.rendang, "Rendang","Rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(3, R.drawable.bakso, "Bakso", "Bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(4, R.drawable.soto, "Soto", "Sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(5, R.drawable.sate, "Sate", "Soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(1, R.drawable.ayam, "Ayam Goreng","Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(2, R.drawable.rendang, "Rendang","Rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(3, R.drawable.bakso, "Bakso", "Bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(4, R.drawable.soto, "Soto", "Sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(5, R.drawable.sate, "Sate", "Soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));

        return makanan;
    }
}
