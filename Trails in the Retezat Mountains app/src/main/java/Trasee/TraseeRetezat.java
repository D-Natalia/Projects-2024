package Trasee;

import Interfete.ITraseeRetezat;

import java.util.ArrayList;
import java.util.List;

    public class TraseeRetezat implements ITraseeRetezat {
        private List<TraseuMontan> traseeVfRetezat;
        private List<TraseuMontan>traseeVfMare;
        private List<TraseuMontan>traseeVfPeleaga;
        private List<TraseuMontan> listaTrasee;
        private DescriereTraseu detalii;
        public TraseeRetezat() {
            traseeVfRetezat = new ArrayList<>();
            traseeVfMare = new ArrayList<>();
            traseeVfPeleaga = new ArrayList<>();

            traseeVfRetezat.add(new TraseuMontan("Rausor-Valea Stevia-Saua Loaia-Varful Retezat", "Cruce galbena(Rusor-Valea Stevia),apoi banda rosie(Saua Lolaia-Varful Retezat)", "9-10 ore dus-intors",
                    new DescriereTraseu("mediu", "\nTraseul începe din stațiunea Râușor și urcă pe Valea Ștevia,\n" + "o vale frumoasă și mai puțin aglomerată, de unde se continuă spre Șaua Lolaia.\n" + "Urcarea în Șaua Lolaia este destul de abruptă,\n" + "dar peisajul se deschide frumos odată ce ajungi în șa,\n" + "cu priveliști asupra vârfurilor din Retezat. De aici, se urmează marcajul bandă roșie care duce la Vârful Retezat (2.482 m).\n" + "Drumul este variat, traversând zone stâncoase, iar porțiunile finale către vârf sunt ceva mai dificile, dar oferă panorame spectaculoase.")));
            traseeVfRetezat.add(new TraseuMontan("Râușor – Șaua Ciurila – Culmea Lolaia – Șaua Lolaia – Vârful Retezat", "Banda galbena(Rausor-Saua Ciurila),apoi banda rosie(Culmea Lolaia-Varful Retezat)", "10-11 ore dus-intors",
                    new DescriereTraseu("medie", "\nAcest traseu începe tot din Râușor și urcă mai întâi spre Șaua Ciurila.\n" + "Traseul prin această șa este ceva mai lin comparativ cu Valea Ștevia, oferind o ascensiune progresivă.\n" + "După atingerea Culmii Lolaia, drumul devine mai spectaculos, cu porțiuni stâncoase și priveliști deschise către vârfurile din jur.\n" + "După ce ajungi în Șaua Lolaia, traseul continuă pe același drum marcat cu bandă roșie, urcând spre Vârful Retezat (2.482 m).\n" + "Urcarea finală este mai tehnică, necesitând atenție sporită, însă panorama de pe vârf este impresionantă,\n" + "cu vedere către cele mai importante masive și lacuri glaciare ale Retezatului.")));
            traseeVfRetezat.add(new TraseuMontan("Râușor – Valea Valereasca – Vârful Retezat", "triunghi rosu", "7-8 ore dus-intors",
                    new DescriereTraseu("medie", "\nTraseul montan către Vf. Retezat ce pornește din Stațiunea Râușor este cel care ne poartă pașii prin Valea Valereasca.\n" + "Marcajul acestui traseu este triunghi roșu. Dacă alegem să urcăm pe acest traseu,\n" + "prima porțiune urmează un drum forestier destul de lung până ce trecem de câteva stâne, unele abandonate.\n" + "Apoi începe un urcuș foarte abrupt și destul de alunecos prin pădure până în zona subalpină.\n" + "De aici peisajul începe să se schimbe, iar atunci când ajungem în zona subalpină avem înaintea noastră\n" + "imaginea superbă înspre Rezervația Științifică Gemenele. Traseul urcă până ce ajungem în zona cu lespezi de piatră,\n" + "iar apoi un urcuș nu foarte abrupt înspre vârf. Și iată-ne pe Vârful Retezat!")));
            traseeVfRetezat.add(new TraseuMontan("Cabana Pietrele – Valea Stânișoara – Lacul Stânișoara – Șaua Retezat – Vârful Retezat", "Triunghi albastru", "7 ore dus-intors",
                    new DescriereTraseu("medie", "\nTraseul pornește din zona Râușor, urmează Valea Valereasca,\n" + "oferind peisaje montane spectaculoase și trecând prin zone împădurite și alpine.\n" + "Destinația finală este Vârful Retezat, unul dintre cele mai impresionante vârfuri din masivul Retezat,\n" + "cu o altitudine de 2.482 metri.")));
            traseeVfRetezat.add(new TraseuMontan("Cabana Pietrele – Valea Stânișoara – Șaua Ciurila –Culmea Lolaia – Șaua Lolaia – Vârful Retezat", " pornind de la Cabana Pietrele urmează marcajul comun\n" + "triunghi albastru și cruce albastră până la bifurcația spre Șaua Ciurila.\n" + "La bifurcație facem dreapta în direcția de urcare pe vale.\n" + "Urmează un urcuș nu foarte abrupt până în Șaua Ciurila\n" + "unde intersectăm marcajul bandă galbenă", "4-5 ore dus-intors",
                    new DescriereTraseu("medie", "\nTraseul începe de la Cabana Pietrele, urcând prin Valea Stânișoara,\n" + "cu priveliști impresionante asupra naturii din jur. Continuă prin Șaua Ciurila, pe Culmea Lolaia și ajunge în Șaua Lolaia,\n" + "oferind o panoramă largă asupra întregii zone. Destinația finală este Vârful Retezat,\n" + "unul dintre cele mai populare și pitorești vârfuri din Munții Retezat.")));
            traseeVfRetezat.add(new TraseuMontan("Cabana Pietrele – Culmea Lolaia – Șaua Lolaia – Vârful Retezat", "Banda galbena", "5-6 ore dus-intors",
                    new DescriereTraseu("mediu", "\nAcest traseu începe printr-un urcuș destul de abrupt prin pădure până ce ieșim în zona subalpină.\n" + "Din acest moment începem să avem o perspectivă superbă asupra crestelor Retezatului.\n" + "Urcușul continuă constant și ajungem apoi în Șaua Ciurila unde intersectăm traseele care vin dinspre Râușor\n" + "și de la Cabana Pietrele prin Valea Stânișoara. Urcușul continuă și devine mai accentuat cu fiecare metru\n" + "până în zona vârfurilor Lolaia Sud și Lolaia Nord. Apoi coborâm în Șaua Lolaia,\n" + "iar de aici ne mai așteaptă cca. 1 oră de urcat.")));
            traseeVfRetezat.add(new TraseuMontan("Lacul Bucura – Curmătura Bucurii – Vârful Bucura II – Șaua Retezat – Vârful Retezat", "Banda rosie", "10-11 ore dus-intors",
                    new DescriereTraseu("mediu", "\nDacă ai ales să campezi în zona Lacului Bucura, unul dintre cele mai frumoase locuri unde poti dormi cu cortul,\n" + "urcăm de la cel mai mare lac glaciar din țară în Curmătura Bucurii și de aici urmăm marcajul bandă roșie spre Vârful Bucura II.\n" + "După ce trecem de vârf începem coborârea înspre Șaua de vară a Retezatului\n" + "unde intersectăm și traseul care vine din Valea Stânișoara. Apoi începem ultimul urcuș înspre Vf. Retezat.\n" + "Acest traseu este unul destul de lung, cu o porțiune mai complicată în zona Vf. Bucura II.")));
            traseeVfRetezat.add(new TraseuMontan("Lacul Bucura – Tăul Porții – Poarta Bucurii – Șaua Retezat – Vârful Retezat", "Banda galbena", "3-3.5 ore",
                    new DescriereTraseu("mediu", "\nTraseul urmează marcajul bandă galbenă spre Tăul Porții și urcă apoi înspre Poarta Bucurii.\n" + "Apoi traseul ajunge într-o porțiune mai tehnică, unde avem și câteva mici sectoare cu lanțuri și unde trebuie atenție.\n" + "Practic acest traseu marcat este sub Vf. Bucura II și la un moment dat observăm și marcajul care duce pe acest vârf.\n" + "Urmează coborârea către Șaua de vară a Retezatului și apoi urcarea din șa către Vf. Retezat.")));


            traseeVfMare.add(new TraseuMontan("Carnic-Lacul Gales-Varfulf Mare", "Banda galbena", "5-7 ore dus-intors",
                    new DescriereTraseu("medie spre ridicata", "\nDe la Carnic la Lacul Galeș, urcarea este constantă, dar bine definită, cu porțiuni de pante mai\n" + "accentuate. Între Lacul Galeș și Vârful Mare, întâlnești Șaua Galeș, un loc bun pentru odihnă,\n" + "iar urcarea spre Vârful Mare devine mai abruptă, incluzând zone cu bolovani și pietriș, necesita\n" + "atenție. Pe traseu, te poți bucura de peisaje diverse, cu păduri, prairii alpine și stânci expuse.")));
            traseeVfMare.add(new TraseuMontan("Lacul Bucura-Varful Peleaga- Șaua Pelegii –Vârful Păpușa-Șaua Porțile Închise – Șaua Vârful Mare-Varfum Mare", "Cruce galbena si banda rosie", "10-11 ore dus intors",
                    new DescriereTraseu("ridicata", "\nTraseul începe la Lacul Bucura, situat la 2.000 m altitudine. Urmând marcajul cruce galbena,\n" + "urci spre Vf. Peleaga (2.509 m), cel mai înalt vârf din Retezat, unde te așteaptă priveliști\n" + "spectaculoase. Continuând pe bandă roșie, cobori spre Șaua Pelegii și urci pe Vf. Păpușa (2.508 m).\n" + "Această porțiune este moderat dificilă, dar bine marcată. De la Vf. Păpușa, traseul\n" + "devine mai tehnic și solicitant, în special în zona dintre Vf. Păpușa și Șaua Porțile Închise,\n" + "unde întâlnești pante abrupte și zone cu bolovani.După ce treci prin Șaua Porțile Închise,\n" + "traseul te conduce spre Șaua Vârful Mare, unde poți admira crestele și văile din jur.")));


            traseeVfPeleaga.add(new TraseuMontan("Lacul Bucura-Varful Peleaga", "Cruce galbena", "4 ore dus-intors",
                    new DescriereTraseu("medeie", "De la Refugiul Salvamont Bucura te indrepti spre Vârful Peleaga, urmând marcajul turistic\n" + "cruce galbenă, la început de-a lungul unui pârâiaș și apoi trece prin zone cu bolovani. \n" + "Ajungi pe Vârful Peleaga (2509 m), cel mai înalt din Munții Retezat, după mai bine de 1h30.\n" + "Priveliștea de pe Vârful Peleaga este superbă: spre sud-vest se pot vedea lacurile Bucura și Ana,\n" + "la nord-vest vârful Retezat (2482 m) iar la nord-est tăurile din Valea Rea")));
            traseeVfPeleaga.add(new TraseuMontan("Cabana Gentiana-Lacul Pietrele-Curmatura Bucurei-Lacul Bucura-Varful Peleaga", "Banda albastra, cruce galbena", "8-9 ore dus-intors",
                    new DescriereTraseu("mica", "Traseul pornește de la Cabana Gentiana, urmând marcajul bandă albastra către Lacul\n" + "Pietrele, un lac glaciar pitoresc. Continuând pe aceeași bandă, ajungi la Curmătura Bucurei,\n" + "de unde te poți bucura de priveliști spectaculoase. Apoi cobori spre Lacul Bucura, cel mai\n" + "mare lac glaciar din România. Ultimul segment te conduce la Vf. Peleaga (2.509 m), unde întâlnești\n" + "o urcare mai tehnică. Durata totală a traseului este de aproximativ 8 ore (dus-întors),\n" + "iar dificultatea este considerată usoara spre medie, fiind ideală pentru iubitorii\n" + "de natură care caută o aventură montană autentică")));

        }

        public List<TraseuMontan> getTraseeVfRetezat() {
            return traseeVfRetezat;
        }
        public List<TraseuMontan> getTraseeVfMare() {
            return traseeVfMare;
        }
        public List<TraseuMontan> getTraseeVfPeleaga() {
            return traseeVfPeleaga;
        }

        @Override
        public List<TraseuMontan> getListaTrasee() {
            return List.of();
        }

        @Override
        public String toString(){
            return "Alege un vârf selectand un numar din lista:\n"+
                    "1. Vârful Retezat\n"+
                    "2. Vârful Mare\n"+
                    "3. Vârful Peleaga\n"+
                    "4. Iesire\n";
        }

    }


