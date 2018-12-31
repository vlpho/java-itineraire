import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*;
import java.awt.HeadlessException;
import java.io.*; 

import java.util.List;
import java.util.ArrayList;


public class FileIntoList {

	String fileName;

	public FileIntoList(String fileName) throws HeadlessException {
		this.fileName = fileName;
	}
	
	public List<String> readList() { 
		List<String> lines = Collections.emptyList(); 
		try { 
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);	// Input length = 1 at java.nio.file.Files.readAllLines(Unknown Source) 
		} catch (IOException e) { 
			System.out.println("\ngetMessage() : " + e.getMessage());
			System.out.println("\ntoString() : " + e.toString());
			e.printStackTrace(); 
		} 
		return lines; 
	} 

	public ArrayList<String> readVilleList() { 
		
		ArrayList<String> lines = new ArrayList<>(); 

		lines.add(new String("Abbeville;111;532;110"));
		lines.add(new String("Agen;99;433;754"));
		lines.add(new String("Aix en Provence;51;815;825"));
		lines.add(new String("Albertville;217;877;600"));
		lines.add(new String("Albi;105;554;784"));
		lines.add(new String("Alençon;120;403;290"));
		lines.add(new String("Alès;168;705;760"));
		lines.add(new String("Ambérieu en Bugey;218;800;557"));
		lines.add(new String("Amiens;13;565;132"));
		lines.add(new String("Angers;65;353;395"));
		lines.add(new String("Angoulème;97;400;594"));
		lines.add(new String("Annecy;214;860;560"));
		lines.add(new String("Argentan;121;396;258"));
		lines.add(new String("Arles;230;750;813"));
		lines.add(new String("Arras;6;599;89"));
		lines.add(new String("Aubenas;165;728;710"));
		lines.add(new String("Auch;154;428;815"));
		lines.add(new String("Aurillac;171;572;677"));
		lines.add(new String("Autun;110;712;454"));
		lines.add(new String("Auxerre;43;658;361"));
		lines.add(new String("Avignon;49;764;781"));
		lines.add(new String("Avranches;66;300;260"));
		
		lines.add(new String("Bapaume;117;605;110"));
		lines.add(new String("Bayonne;160;263;825"));
		lines.add(new String("Beaune;88;743;450"));
		lines.add(new String("Beauvais;77;549;185"));
		lines.add(new String("Belfort;194;903;375"));
		lines.add(new String("Bergerac;152;423;682"));
		lines.add(new String("Besançon;196;846;417"));
		lines.add(new String("Béthune;115;590;65"));
		lines.add(new String("Béziers;54;639;850"));
		lines.add(new String("Blois;64;492;387"));
		lines.add(new String("Bonneville;215;877;587"));
		lines.add(new String("Bordeaux;59;341;683"));
		lines.add(new String("Boulogne/Mer;12;517;40"));
		lines.add(new String("Bourg en Bresse;212;787;532"));
		lines.add(new String("Bourges;30;573;440"));
		lines.add(new String("Bourgoin Jallieu;220;797;600"));
		lines.add(new String("Brest;71;70;278"));
		lines.add(new String("Briançon;222;903;670"));
		lines.add(new String("Brienne le Château;184;728;295"));
		lines.add(new String("Brioude;162;647;635"));
		lines.add(new String("Brive la Gaillarde;56;505;649"));
		
		lines.add(new String("Caen;67;374;209"));
		lines.add(new String("Cahors;57;497;729"));
		lines.add(new String("Calais;11;535;15"));
		lines.add(new String("Cambrai;4;630;100"));
		lines.add(new String("Cannes;227;940;819"));
		lines.add(new String("Carcassonne;55;570;865"));
		lines.add(new String("Châlons/Marne;21;712;235"));
		lines.add(new String("Châlons/Saône;22;756;472"));
		lines.add(new String("Chambéry;219;847;600"));
		lines.add(new String("Charleville-Mézière;174;737;145"));
		lines.add(new String("Chartres;39;505;293"));
		lines.add(new String("Château-Salins;179;870;245"));
		lines.add(new String("Château-Thierry;203;643;225"));
		lines.add(new String("Châteaubriant;127;293;362"));
		lines.add(new String("Châteaudun;139;494;332"));
		lines.add(new String("Châteauroux;94;518;470"));
		lines.add(new String("Châtillon/Saône;109;732;356"));
		lines.add(new String("Chaumont;85;773;325"));
		lines.add(new String("Cherbourg;124;282;155"));
		lines.add(new String("Chôlet;145;326;437"));
		lines.add(new String("Civray;150;402;542"));
		lines.add(new String("Clamecy;108;655;400"));
		lines.add(new String("Clermont Ferrand;36;625;582"));
		lines.add(new String("Collonges;213;835;540"));
		lines.add(new String("Colmar;189;937;322"));
		lines.add(new String("Compiègne;17;602;186"));
		lines.add(new String("Cosne;90;612;404"));
		
		lines.add(new String("Epinal;191;870;314"));
		lines.add(new String("Evreux;40;482;228"));
		
		lines.add(new String("Dieppe;15;478;130"));
		lines.add(new String("Dijon;87;770;410"));
		lines.add(new String("Dinan;131;248;280"));
		lines.add(new String("Dôle;197;808;435"));
		lines.add(new String("Domfront;122;350;270"));
		lines.add(new String("Douarnenez;27;79;310"));
		lines.add(new String("Doué;144;372;427"));
		lines.add(new String("Doullens;116;567;105"));
		lines.add(new String("Dreux;73;496;260"));
		lines.add(new String("Dunkerque;10;565;7"));
		
		lines.add(new String("Feurs;231;737;590"));
		lines.add(new String("Figeac;91;544;709"));
		lines.add(new String("Foix;93;510;890"));
		lines.add(new String("Font-Romeu;26;542;940"));
		lines.add(new String("Fontainebleau;84;593;297"));
		lines.add(new String("Fougères;125;309;296"));
		
		lines.add(new String("Gap;223;861;708"));
		lines.add(new String("Genève;210;860;530"));
		lines.add(new String("Grasse;226;932;806"));
		lines.add(new String("Grenoble;24;828;640"));
		lines.add(new String("Guignes;205;600;270"));
		lines.add(new String("Guingan;134;167;262"));
		lines.add(new String("Guise;80;660;132"));
		
		lines.add(new String("Hesdin;113;546;80"));
		
		lines.add(new String("La Cappelle;172;680;125"));
		lines.add(new String("La Charité;106;620;429"));
		lines.add(new String("La Flèche;142;389;372"));
		lines.add(new String("La Roche/Yon;146;284;480"));
		lines.add(new String("La Rochelle;147;300;535"));
		lines.add(new String("Langres;198;786;355"));
		lines.add(new String("Lannemezan;156;411;871"));
		lines.add(new String("Lannion;135;147;245"));
		lines.add(new String("Laon;20;660;168"));
		lines.add(new String("Lausanne;209;893;490"));
		lines.add(new String("Laval;63;339;329"));
		lines.add(new String("Le Câteau;79;652;108"));
		lines.add(new String("Le Havre;118;406;175"));
		lines.add(new String("Le Luc;228;885;835"));
		lines.add(new String("Le Mans;41;410;338"));
		lines.add(new String("Le Puy;163;687;661"));
		lines.add(new String("Lille;7;617;50"));
		lines.add(new String("Limoges;96;485;576"));
		lines.add(new String("Lons le Saunier;211;812;480"));
		lines.add(new String("Lorient;74;145;353"));
		lines.add(new String("Loudéac;132;195;310"));
		lines.add(new String("Lunéville;186;871;269"));
		lines.add(new String("Lyon;23;761;582"));
		
		lines.add(new String("Mâcon;46;756;521"));
		lines.add(new String("Mantes;33;522;230"));
		lines.add(new String("Marmande;153;423;682"));
		lines.add(new String("Marseille;25;805;850"));
		lines.add(new String("Maubeuge;1;683;89"));
		lines.add(new String("Mayenne;123;351;303"));
		lines.add(new String("Mazagran;175;728;187"));
		lines.add(new String("Mazamet;169;570;836"));
		lines.add(new String("Meaux;83;608;235"));
		lines.add(new String("Megève;216;895;562"));
		lines.add(new String("Mende;167;658;721"));
		lines.add(new String("Metz;177;845;213"));
		lines.add(new String("Millau;92;626;765"));
		lines.add(new String("Mont de Marsan;155;343;786"));
		lines.add(new String("Montargis;206;596;341"));
		lines.add(new String("Montauban;58;490;775"));
		lines.add(new String("Montélimar;166;755;714"));
		lines.add(new String("Montluçon;101;588;520"));
		lines.add(new String("Montpellier;53;690;819"));
		lines.add(new String("Montreuil/Mer;9;515;63"));
		lines.add(new String("Morlaix;136;119;260"));
		lines.add(new String("Moulins;102;642;497"));
		lines.add(new String("Mulhouse;190;938;358"));
		
		lines.add(new String("Nancy;44;843;258"));
		lines.add(new String("Nantes;61;276;420"));
		lines.add(new String("Narbonne;89;621;866"));
		lines.add(new String("Neufchâteau;192;813;297"));
		lines.add(new String("Neufchâtel (Suisse);208;912;440"));
		lines.add(new String("Neufchatel en Braye;16;503;150"));
		lines.add(new String("Nevers;107;628;453"));
		lines.add(new String("Nice;50;958;797"));
		lines.add(new String("Nimes;52;729;792"));
		lines.add(new String("Niort;149;355;520"));
		lines.add(new String("Nogent le Rotrou;119;456;304"));
		lines.add(new String("Noyon;201;615;165"));
		
		lines.add(new String("Orange;48;764;758"));
		lines.add(new String("Orléans;31;533;350"));
		lines.add(new String("Orthez;159;310;830"));
		
		lines.add(new String("Paray le Monial;207;732;510"));
		lines.add(new String("Paris;5;567;246"));
		lines.add(new String("Parthenay;151;373;485"));
		lines.add(new String("Pau;158;351;851"));
		lines.add(new String("Périgueux;98;442;647"));
		lines.add(new String("Péronne;199;610;135"));
		lines.add(new String("Perpignan;34;615;920"));
		lines.add(new String("Pleyben;137;100;297"));
		lines.add(new String("Ploermel;76;219;338"));
		lines.add(new String("Poitiers;95;415;495"));
		lines.add(new String("Pontchâteau;128;240;391"));
		lines.add(new String("Pradelles;164;688;691"));
		lines.add(new String("Provins;204;638;280"));
		
		lines.add(new String("Quillan;170;556;900"));
		lines.add(new String("Quimper;72;95;322"));
		
		lines.add(new String("Reims;8;689;202"));
		lines.add(new String("Rennes;28;272;323"));
		lines.add(new String("Roanne;221;697;571"));
		lines.add(new String("Rodez;104;587;739"));
		lines.add(new String("Rostrenen;133;153;300"));
		lines.add(new String("Rouen;14;478;185"));
		lines.add(new String("Roye;200;600;154"));
		
		lines.add(new String("Saintes;148;340;582"));
		lines.add(new String("Sarrebourg;181;911;250"));
		lines.add(new String("Sarreguemines;178;910;210"));
		lines.add(new String("Saumur;143;388;418"));
		lines.add(new String("Savernes;180;935;249"));
		lines.add(new String("Selles;141;517;420"));
		lines.add(new String("Senlis;202;585;210"));
		lines.add(new String("Sens;86;637;319"));
		lines.add(new String("Serres;224;835;723"));
		lines.add(new String("Sézanne;82;667;262"));
		lines.add(new String("Sisteron;225;853;750"));
		lines.add(new String("Soissons;18;640;189"));
		lines.add(new String("Sommesous;183;705;258"));
		lines.add(new String("St Brieuc;70;198;274"));
		lines.add(new String("St Etienne;37;725;615"));
		lines.add(new String("St Dié;187;907;300"));
		lines.add(new String("St Dizier;81;758;269"));
		lines.add(new String("St Flour;103;626;664"));
		lines.add(new String("St Lô;68;320;213"));
		lines.add(new String("St Martory;161;453;870"));
		lines.add(new String("St Meen;130;231;310"));
		lines.add(new String("St Nazaire;138;225;408"));
		lines.add(new String("St Omer;114;561;39"));
		lines.add(new String("St Pol/Ternoise;112;567;82"));
		lines.add(new String("St Quentin;19;636;137"));
		lines.add(new String("Strasbourg;29;960;265"));
		lines.add(new String("Suippes;176;726;215"));
		
		lines.add(new String("Tarbes;157;387;860"));
		lines.add(new String("Thiers;232;657;571"));
		lines.add(new String("Toulon;229;855;869"));
		lines.add(new String("Toulouse;35;498;820"));
		lines.add(new String("Tours;32;445;405"));
		lines.add(new String("Troyes;42;695;308"));
		
		lines.add(new String("Valence;47;766;672"));
		lines.add(new String("Valenciennes;2;650;82"));
		lines.add(new String("Vannes;75;190;365"));
		lines.add(new String("Vendôme;140;473;362"));
		lines.add(new String("Verdun;45;787;210"));
		lines.add(new String("Versailles;60;553;252"));
		lines.add(new String("Vervin;173;679;139"));
		lines.add(new String("Vesoul;195;853;375"));
		lines.add(new String("Vierzon;78;545;426"));
		lines.add(new String("Vire;69;335;243"));
		lines.add(new String("Vitré;126;308;320"));
		lines.add(new String("Vitry le François;182;730;259"));
		lines.add(new String("Vittel;193;834;312"));
		
		return lines; 
	} 

	public ArrayList<String> readRouteList() {
		String [] routes = {
			"1;2;36",
			"1;79;42",
			"1;172;34",
			"2;4;32",
			"2;6;90",
			"2;7;46",
			"2;79;41",
			"4;6;37",
			"4;19;39",
			"4;79;22",
			"4;117;30",
			"4;199;45",
			"5;39;82",
			"5;60;28",
			"5;77;76",
			"5;83;45",
			"5;84;62",
			"5;202;44",
			"5;205;43",
			"6;7;50",
			"6;112;34",
			"6;115;30",
			"6;116;36",
			"6;117;22",
			"7;10;77",
			"7;114;67",
			"7;115;38",
			"8;18;56",
			"8;20;45",
			"8;21;44",
			"8;82;70",
			"8;174;73",
			"8;175;47",
			"8;176;42",
			"8;203;61",
			"9;12;38",
			"9;111;44",
			"9;113;23",
			"9;114;52",
			"10;11;43",
			"10;114;39",
			"11;12;38",
			"11;114;40",
			"12;114;44",
			"13;16;68",
			"13;19;74",
			"13;77;60",
			"13;111;47",
			"13;116;32",
			"13;117;48",
			"13;199;44",
			"13;200;41",
			"14;15;61",
			"14;16;51",
			"14;40;52",
			"14;67;118",
			"14;77;80",
			"14;118;82",
			"14;121;130",
			"15;16;36",
			"15;111;65",
			"15;118;106",
			"16;77;58",
			"16;111;61",
			"17;18;38",
			"17;77;60",
			"17;200;38",
			"17;201;24",
			"17;202;32",
			"18;19;58",
			"18;20;36",
			"18;82;83",
			"18;83;65",
			"18;202;59",
			"18;203;35",
			"19;20;52",
			"19;79;38",
			"19;80;27",
			"19;199;30",
			"19;200;48",
			"19;201;40",
			"20;80;38",
			"20;173;32",
			"20;174;91",
			"21;45;97",
			"21;176;23",
			"21;182;32",
			"21;183;27",
			"22;46;54",
			"22;88;27",
			"22;110;67",
			"22;197;63",
			"22;207;89",
			"22;211;64",
			"22;212;81",
			"23;37;47",
			"23;46;70",
			"23;47;83",
			"23;218;52",
			"23;220;62",
			"23;221;86",
			"23;231;68",
			"24;47;94",
			"24;219;57",
			"24;220;77",
			"24;222;116",
			"24;223;103",
			"24;224;109",
			"25;51;28",
			"25;228;90",
			"25;229;65",
			"25;230;87",
			"26;34;80",
			"26;93;107",
			"26;170;77",
			"27;72;23",
			"27;137;27",
			"28;61;107",
			"28;66;80",
			"28;76;61",
			"28;125;48",
			"28;126;38",
			"28;127;55",
			"28;128;92",
			"28;130;42",
			"28;131;51",
			"29;180;39",
			"29;186;50",
			"29;187;90",
			"29;189;67",
			"30;78;33",
			"30;90;60",
			"30;94;62",
			"30;101;93",
			"30;102;100",
			"31;39;73",
			"31;64;56",
			"31;78;79",
			"31;84;87",
			"31;90;108",
			"31;139;48",
			"31;140;64",
			"31;206;72",
			"32;41;80",
			"32;64;58",
			"32;94;111",
			"32;95;104",
			"32;140;55",
			"32;141;73",
			"32;142;70",
			"32;143;64",
			"33;40;42",
			"33;60;43",
			"33;73;46",
			"33;77;69",
			"34;89;62",
			"34;170;75",
			"35;55;92",
			"35;58;52",
			"35;93;82",
			"35;105;74",
			"35;154;78",
			"35;161;72",
			"35;169;82",
			"36;37;146",
			"36;56;170",
			"36;101;91",
			"36;102;96",
			"36;162;69",
			"36;171;164",
			"36;232;44",
			"37;47;93",
			"37;163;77",
			"37;231;39",
			"37;232;121",
			"39;41;107",
			"39;60;72",
			"39;73;35",
			"39;84;97",
			"39;119;54",
			"39;139;35",
			"40;73;42",
			"40;121;120",
			"41;63;69",
			"41;65;92",
			"41;119;66",
			"41;120;49",
			"41;123;74",
			"41;140;77",
			"41;142;43",
			"42;43;81",
			"42;82;62",
			"42;85;94",
			"42;86;65",
			"42;109;68",
			"42;183;50",
			"42;184;40",
			"43;86;57",
			"43;88;158",
			"43;90;74",
			"43;108;43",
			"43;109;85",
			"43;206;69",
			"44;177;56",
			"44;179;31",
			"44;185;38",
			"44;186;30",
			"44;191;62",
			"44;192;59",
			"44;193;63",
			"45;81;80",
			"45;174;102",
			"45;176;76",
			"45;177;65",
			"45;185;62",
			"46;207;78",
			"46;212;34",
			"47;165;69",
			"47;166;46",
			"47;224;138",
			"48;49;21",
			"48;52;55",
			"48;166;56",
			"48;224;105",
			"49;51;75",
			"49;52;39",
			"49;168;68",
			"49;225;136",
			"49;230;38",
			"50;226;31",
			"50;227;26",
			"51;225;107",
			"51;228;84",
			"51;230;74",
			"52;53;52",
			"52;168;44",
			"52;230;30",
			"53;54;72",
			"53;92;115",
			"53;230;73",
			"54;89;27",
			"54;92;125",
			"54;169;86",
			"55;89;55",
			"55;93;81",
			"55;169;49",
			"55;170;51",
			"56;57;100",
			"56;91;88",
			"56;96;93",
			"56;98;68",
			"56;101;182",
			"56;171;96",
			"57;58;61",
			"57;91;69",
			"57;99;108",
			"58;99;72",
			"58;154;86",
			"59;97;91",
			"59;98;124",
			"59;148;93",
			"59;152;87",
			"59;153;84",
			"59;160;187",
			"60;73;50",
			"61;65;89",
			"61;127;66",
			"61;128;51",
			"61;145;57",
			"61;146;59",
			"63;65;74",
			"63;123;25",
			"63;125;48",
			"63;126;33",
			"63;127;67",
			"64;78;75",
			"64;140;32",
			"64;141;39",
			"65;127;71",
			"65;142;48",
			"65;143;54",
			"65;144;41",
			"65;145;71",
			"66;68;56",
			"66;69;50",
			"66;122;66",
			"66;124;132",
			"66;125;40",
			"66;131;70",
			"67;68;59",
			"67;69;60",
			"67;121;59",
			"67;122;78",
			"67;124;120",
			"68;124;78",
			"69;122;40",
			"69;125;67",
			"70;130;66",
			"70;131;57",
			"70;132;42",
			"70;133;59",
			"70;134;34",
			"70;135;79",
			"71;136;60",
			"71;137;45",
			"72;74;66",
			"72;133;72",
			"72;137;27",
			"73;119;65",
			"73;120;110",
			"74;75;51",
			"74;76;79",
			"74;132;73",
			"74;133;63",
			"75;76;47",
			"75;128;59",
			"76;130;34",
			"76;132;43",
			"77;200;67",
			"77;202;51",
			"78;94;58",
			"79;80;27",
			"79;172;32",
			"80;172;23",
			"80;173;25",
			"81;85;74",
			"81;182;29",
			"81;184;46",
			"81;185;54",
			"81;192;82",
			"82;83;77",
			"82;86;79",
			"82;183;63",
			"82;203;48",
			"82;204;42",
			"83;84;85",
			"83;202;36",
			"83;203;47",
			"83;204;74",
			"83;205;41",
			"84;86;53",
			"84;204;36",
			"84;205;33",
			"84;206;48",
			"85;109;58",
			"85;192;56",
			"85;198;25",
			"86;204;34",
			"86;206;51",
			"87;88;52",
			"87;109;84",
			"87;195;97",
			"87;196;84",
			"87;197;49",
			"87;198;78",
			"88;110;40",
			"88;197;61",
			"90;106;28",
			"90;108;54",
			"90;206;73",
			"91;104;72",
			"91;105;107",
			"91;171;64",
			"92;103;141",
			"92;104;70",
			"92;105;113",
			"92;167;89",
			"92;169;145",
			"93;161;90",
			"93;170;62",
			"94;95;120",
			"94;96;126",
			"94;101;98",
			"94;141;59",
			"95;96;121",
			"95;143;80",
			"95;144;92",
			"95;149;75",
			"95;150;54",
			"95;151;50",
			"96;97;103",
			"96;98;102",
			"96;101;147",
			"96;150;95",
			"97;98;86",
			"97;148;70",
			"97;150;56",
			"98;99;138",
			"98;152;47",
			"99;152;91",
			"99;153;58",
			"99;154;71",
			"99;155;112",
			"101;102;76",
			"102;107;60",
			"102;207;52",
			"102;221;99",
			"102;232;91",
			"103;104;175",
			"103;162;43",
			"103;163;92",
			"103;167;109",
			"104;105;79",
			"104;171;90",
			"105;169;58",
			"106;107;24",
			"106;108;52",
			"107;108;69",
			"107;110;102",
			"110;207;67",
			"111;113;30",
			"111;116;41",
			"112;113;20",
			"112;115;29",
			"112;116;28",
			"113;114;43",
			"113;116;38",
			"114;115;44",
			"117;199;28",
			"119;120;62",
			"119;139;55",
			"120;121;44",
			"120;122;61",
			"120;123;61",
			"121;122;55",
			"122;123;35",
			"123;125;44",
			"125;126;37",
			"126;127;45",
			"128;138;23",
			"130;131;36",
			"130;132;43",
			"132;133;47",
			"133;134;45",
			"133;136;68",
			"133;137;62",
			"134;135;32",
			"134;136;52",
			"135;136;38",
			"136;137;49",
			"139;140;39",
			"142;143;51",
			"143;144;59",
			"144;145;59",
			"144;151;60",
			"145;146;27",
			"145;151;72",
			"146;147;85",
			"146;149;85",
			"146;151;82",
			"147;148;66",
			"147;149;61",
			"148;149;72",
			"149;150;56",
			"149;151;42",
			"152;153;57",
			"153;155;83",
			"154;155;104",
			"154;156;63",
			"154;157;73",
			"155;158;77",
			"155;159;54",
			"155;160;97",
			"156;157;36",
			"156;161;45",
			"157;158;40",
			"158;159;41",
			"159;160;66",
			"162;163;61",
			"162;171;104",
			"163;164;33",
			"163;165;87",
			"164;165;58",
			"164;167;59",
			"164;168;108",
			"165;166;41",
			"165;168;74",
			"167;168;103",
			"172;173;17",
			"172;174;68",
			"173;174;69",
			"174;175;48",
			"174;177;160",
			"175;176;31",
			"177;178;67",
			"177;179;45",
			"178;179;59",
			"178;180;70",
			"178;181;59",
			"179;181;43",
			"179;186;30",
			"180;181;30",
			"182;183;26",
			"182;184;42",
			"185;192;42",
			"186;187;46",
			"187;189;56",
			"187;191;47",
			"189;190;41",
			"190;191;110",
			"190;194;41",
			"191;193;44",
			"191;194;79",
			"191;195;82",
			"192;193;33",
			"192;198;69",
			"193;195;100",
			"193;198;65",
			"194;195;63",
			"194;196;90",
			"195;196;45",
			"195;198;75",
			"196;197;46",
			"196;208;110",
			"196;209;127",
			"196;211;77",
			"197;211;51",
			"199;200;23",
			"200;201;20",
			"204;205;41",
			"208;209;69",
			"209;210;38",
			"210;211;115",
			"210;213;30",
			"210;214;44",
			"210;215;21",
			"211;212;61",
			"212;213;80",
			"213;214;41",
			"214;215;16",
			"214;217;46",
			"214;219;44",
			"215;216;43",
			"216;217;23",
			"217;219;49",
			"218;219;79",
			"218;220;28",
			"219;220;45",
			"221;231;39",
			"221;232;70",
			"222;223;87",
			"223;224;41",
			"223;225;43",
			"224;225;29",
			"225;226;156",
			"226;227;17",
			"226;228;64",
			"227;229;129",
			"228;229;57",
			"231;232;69"
			};
		ArrayList<String> lines = new ArrayList<>(); 		
		for (String route : routes) {
			lines.add(route);			
		}
		return lines; 
	} 

}
