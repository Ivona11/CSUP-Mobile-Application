package com.example.recepti;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {
    ListView listView;


    String mTittle[] = {"Američke palačinke","Kobasice u lisnatom tijestu","Punjeni baget","Baklava","Slana tost torta","Piletina iz marinade","Pljeskavice iz rerne","Svinjska rebra sa Coca-Cola glazurom","Đuveč sa carskim rebrima","Priganice"};
    String mDescription[] = {"200 grama brašna\n" +
            "2 kašičice praška za pecivo\n" +
            "malo sode bikarbone\n" +
            "2 jajeta\n" +
            "300 mililitara mlijeka\n" +
            "1 kašika ulja ili putera\n" +
            "malo soli\n" +
            "2 kašike šećera\n" +
            "1 vanilin šećer","20 manjih kobasica\n" +
            "800 g lisnatog tijesta\n" +
            "2 jaja\n" +
            "40 g susama","1 kom francuski hleb baget\n" +
            "0,5 margarina\n" +
            "50 grama majoneza\n" +
            "2 kom. jaja\n" +
            "100 grama salame\n" +
            "50 grama kačkavalja\n" +
            "3 kom. kisela krastavca","500g gotovih kora za baklavu\n" +
            "500g oraha - pola mljevenih, pola sjeckanih (može i manje)\n" +
            "3 kašike krušnih mrvica (prezle)\n" +
            "100ml ulja za premazivanje kora\n" +
            "još 125ml ulja i 125g maslaca za zalijevanje baklave\n" +
            "800ml vode\n" +
            "800g šećera\n" +
            "sok od pola limuna","2 pakovanja tost hleba\n" +
            "400g majoneza\n" +
            "400g kisele pavlake\n" +
            "so\n" +
            "300g salame\n" +
            "4komada kisela krastavca\n" +
            "2kasike kecapa\n" +
            "100g feta sira\n" +
            "200g trapista\n" +
            "4 tvrdo kuvana jaja","1 kg pilećeg mesa po želji\n" +
            "70 g kisele pavlake 20 % mm\n" +
            "1/2 kašičice karija\n" +
            "2 čena belog luka\n" +
            "2 kašičice suvog biljnog začina\n" +
            "50 ml belog vina\n" +
            "30 ml maslinovog ulja","500 g mešanog mlevenog mesa\n" +
            "1 crni luk\n" +
            "60 g gaude\n" +
            "40 g prezli\n" +
            "1 ravna kašičica soli\n" +
            "1 kašičica biljnog začina\n" +
            "120 ml tople mineralne gazirane vode\n" +
            "1 ravna kašičica bikarbone sode\n" +
            "5 prepeličijih jaja","svinjska rebra u komadu\n" +
            "250 ml Coca-Cole\n" +
            "2 kašike soja sosa\n" +
            "1 kašičica začinske paprike\n" +
            "1 kašičica meda\n" +
            "1 kašika soli\n" +
            "biber i so za meso","200 g crnog luka\n" +
            "100 g praziluka\n" +
            "3 čena belog luka\n" +
            "200 g pirinča\n" +
            "450 g mešanog povrća za đuveč – Frikom\n" +
            "500 g suvih carskih rebara\n" +
            "500 g krompira\n" +
            "1 kašičica začinske paprike\n" +
            "1 kašika suvog začina\n" +
            "veza peršuna\n" +
            "600-700 ml tople vode" , "1,5 šolja od bijele kafe brašna\n" +
            "voda\n" +
            "ulje\n" +
            "so\n" +
            "kvasac\n" +
            "šećer"};
    String mOpis[] = {"Odvojte žumance od belanca, pa bjelanaca dobro umutite. Umutite žumanca sa šećerom i vanilinim šećerom, zatim dodajte ulje (ili puter), kratko izmiksajte, pa dodajte mleko. Smanjite brzinu miksera i u smjesu dodajte brašno, prašak za pecivo, sodu bikarbonu i malo soli. Na kraju lagano ručno umješajte bjelanca. Tiganj namastite uljem ili puterom, zagrijte na srednjoj temperaturi i izlijte određenu količinu smjese. Kada počnu da se prave mjehurići, palačinka je spremna za prevrtanje. Prijatno!","U odgovcarajuću posudu staviti kobasice, naliti vodom da ogreznu, pa kuhati na umerenoj temperaturi dok ne omekšaju. Zatim ih izvaditi i ostaviti da se ohlade. Lisnato tijesto razvući oklagijom na debljinu od 5 mm , zatim okruglim nozem isjeći na trake sirine 3 cm a duzine 20 cm. Svaku traku od lisnatog tijesta uviti oko središnjeg dijela obarene kobasice. Uvijene kobasice premazati umučenim jajem i posuti susamom. Veci pleh obloziti papirom za pecenje, pa poslagati rolovane kobasice. Peci u zagrijanoj pećnici na 200 C dok ne porumene. Pečene kobasice ostaviti da se ohlade, potom ih staviti u suhu posudu i prekriti najlon vrećicom kako bi zadržale svježinu do posluživanja.","Francuski hleb (bolje je kad nije svjež) presjeći i sredinu izdubiti kašikom.\n" +
            "Margarin pjenasto izraditi mikserom pa dodati, majonez, izmrvljenu sredinu hleba,\n" +
            "kuvana jaja, salamu i krastavčiće sjeckane na kockice i krupno rendani kačkavalj.\n" +
            "Začiniti po ukusu, pa tom smesom puniti izdubljeni hleb. Umotati u foliju i ostaviti preko noći u frižideru da se stegne.\n" +
            "Sjeći na kolutove i servirati.","Priprema nadjev:\n" +
            "Prvo napraviti nadjev (šerbet ili agdu) kako bi se ohladio kada baklava bude pečena. \n" +
            "Kuvati vodu i šećer 20-ak min. Pred kraj dodati sok od pola limuna. \n" +
            "Ostaviti da se hladi za vrijeme pravljenja baklave, jer ide vruća baklava - hladan nadjev.\n" +
            "Priprema baklave:\n" +
            "Tepsiju veličine 20x30cm premazati uljem. Kore izrezati na veličinu tepsije.\n" +
            "Orahe i prezlu izmješati. Najprije redjati u tepsiju 3 kore svaku premazati uljem (s cetkicom).\n" +
            "Četvrtu posuti mješavinom oraha i prezle (odprilike 3-4 kašike) petu premazati uljem.\n" +
            "Tako redjati do kraja, jednu premazati uljem, sledeću posuti orasima dok se ne potroši sav materijal. \n" +
            "Na kraju 3 kore premazati samo uljem kao na početku. Ostaviti sa strane još jednu koru. Baklavu isjeći dijagonalno na rombove.\n" +
            "Zagrijati 125ml ulja i 125g maslaca te preliti preko isječene baklave. Na baklavu staviti jednu cijelu koru koju smo ostavili sa strane kako nebi izgorila.\n" +
            "Baklava se peče 50min. Zagrijati rernu na 220C. Prvih 10 minuta peći na 220C. Smanjiti na 180C pa peći idućih 30 minuta na 180C.\n" +
            "Na kraju pečenja ponovo pojačati temperaturu na 200C pa peći još 10 minuta. \n" +
            "Izvaditi iz rerne, skinuti gornju koru (koja je malo izgorila) i preliti hladnim zaljevom.\n" +
            "Kada upije zaljev mozete poklopiti drugom tepsijom 10-ak minuta da stoji kako se nebi gornja kora dizala.\n" +
            "Ostaviti da se hladi na sobnoj temperaturi, pa prebaciti u frižider pokrivenu aluminijskom folijom.\n" +
            "Baklava može dugo stajati u frižideru, ali nestat ce u trenu. U slast!\n","Pavlaku,majonez i malo soli pomesati i podjeliti na 3 djela. \n" +
            "Nozem odstraniti korice sa tost hleba. Poredjati na vecu tacnu. \n" +
            "Izbrojte ukupno koliko komada imate u oba pakovanja i podjelite na 3 djela.\n" +
            "Znaci jedan deo poredjajte na tacnu. U jedan deo fila izrendajte kuvana jaja i kisele krastavcice. \n" +
            "Naslozite drugi dio tost hleba. U drugi dio izrendajte sunkaricu(moze salama) i feta sir. \n" +
            "Premazite tost hleb i stavite 3 red hleba. U treci dio stavite kecap, izrendajte trapist sir.\n" +
            "Premazite tost hleb. Ostaviti preko noći u frižideru da se stegne. Sjeći na kocke i servirati.\n" +
            "Prijatno!","U sud sipajte i sjedinite kiselu pavlaku, kari, isjeckan bijeli luk, suvi začin, bijelo vino i maslinovo ulje.\n" +
            "Prelijte preko piletine i ostavite 30 minuta. Nakon tog vremena preručite u podmazan pekač ili \n" +
            "tepsiju i pecite na 220 °C oko 35 minuta ili zavisno od vaše rerne.\n" +
            "Uz piletinu možete poslužiti uštipke od tikvica i sira.\n" +
            "Prijatno!","U sud stavite mljeveno meso, sitno isjeckan crni luk, gaudu isjeckanu na sitne kockice ili krupno izrendanu, \n" +
            "so, biljni začin, prezle i bikarbonu sodu. Promješajte pa dodajte toplu gaziranu mineralnu vodu i promješajte. \n" +
            "Pokrijte streč folijom i ostavite 1 sat u frižider, a nakon toga podjeliti na 5 djelova.\n" +
            "Napravite pljeskavice. Pljeskavice prebacite u pleh i napravite uduljenje u sredinu u koje ćete staviti po jedno prepeličije jaje.\n" +
            "Pecite u zagrijanoj rerni na 200 °C oko 25 minuta, najbolje na donjoj rešetki, a zadnjih 5 minuta možete na srednjoj. \n" +
            "Prijatno!","Svinjska rebra pospite biberom i solju i rukama dobro utrljajte u meso. \n" +
            "Uvijte u foliju i ostavite preko noći u frižider.\n" +
            "U odgovarajući sud sipajte Coca-Colu, soja sos, začinsku papriku, med i so. \n" +
            "Na umjerenoj temperaturi kuvajte da se glazura malo zgusne. Glazuru podjelite u četiri činijice.\n" +
            "Rebra izvadite iz folije i stavite u pekač. Premažite glazurom iz prve činijice i pecite na 150 °C.\n" +
            "Na svakih 30 minuta rebra okrenite i premažite glazurom.\n" +
            "Prijatno!\n","Na ulju propržite crni luk, praziluk i bijeli luk.\n" +
            "Dodajte pirinač a onda i Frikom đuveč. Propržite 10 minuta. \n" +
            "Na kraju stavite rebra isječena na parčiće, krompir, začinsku papriku, suvi začin i isjeckan peršun.\n" +
            "Sve dobro promješajte i sipajte u tepsiju ili pekač. Nalijte 600-700 ml tople vodu i pecite 2h na 200 °C.\n" +
            "Napomena: Nakon 30 minuta izvadite tepsiju iz rerne, promješajte dobro i vratite da se dopeče.\n" +
            "Prijatno!" ,"Razmutiti kasiku kvasca (ili germe sve jedno ) u 1/4 case zasladjene vode i dodajte je u 1.5 šolju brasna, posolite, dodajte 2 kasike ulja i 1/2 solje vode.\n" +
            "Tijesto treba da bude rjedje nego za hljeb i treba ga ulupati varjacom pa ostaviti da se odmara u toplom sat vremena.\n" +
            "Poslije samo kasikom vaditi parcad i peci na vrelom ulju, kao krofne. Jesti toplo sa kajmakom ili mladim sirom, medom, džemom, šećerom.\n" +
            "Prijatno!"};
    int images[] = {R.drawable.americke_palacinke,R.drawable.kobasice,R.drawable.baget,R.drawable.baklava,R.drawable.torta,R.drawable.marinada,R.drawable.pljeskavica,R.drawable.rebra,R.drawable.carska,R.drawable.priganice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent inte = new Intent(MainActivity.this,Recept.class);
                inte.putExtra("Naziv",mTittle[position]);
                inte.putExtra("Sastojci",mDescription[position]);
                inte.putExtra("Recept",mOpis[position]);
                inte.putExtra("slika",images[position]);

                startActivity(inte);




            }
        });

        MyAdapter adapter = new MyAdapter(MainActivity.this,mTittle,mDescription,images,mOpis);
        listView.setAdapter(adapter);



    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTittle[];
        String rDescription[];
        String rOpis[];
        int rImgs[];

        MyAdapter(Context c,String tittle[],String description[],int imgs[],String opis[]){
            super(c,R.layout.row,R.id.textView1,tittle);
            this.context = c;
            this.rTittle = tittle;
            this.rDescription = description;
            this.rImgs = imgs;
            this.rOpis = opis;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTittle = row.findViewById(R.id.textView1);


            images.setImageResource(rImgs[position]);
            myTittle.setText(rTittle[position]);






            return row;
        }




    }




}
