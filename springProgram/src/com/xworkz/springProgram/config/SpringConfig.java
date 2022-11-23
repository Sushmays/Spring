package com.xworkz.springProgram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springProgram.bean.Animals;
import com.xworkz.springProgram.bean.Bottle;
import com.xworkz.springProgram.bean.Colors;
import com.xworkz.springProgram.bean.Metro;
import com.xworkz.springProgram.bean.Numbers;
import com.xworkz.springProgram.bean.Purifier;
import com.xworkz.springProgram.bean.Slipper;
import com.xworkz.springProgram.bean.Water;

@Configuration
@ComponentScan("com.xwrkz.springframework")
public class SpringConfig {

	@Bean
	public Water drink() {
		System.out.println("Register the water 1");
		Water water = new Water();
		return water;
	}

	@Bean
	public String color() {
		System.out.println("Register the color 2");
		return "colorLess";
	}

	@Bean
	public String moon() {
		System.out.println("Register the moon 3");
		return "moonIsRound";
	}

	@Bean
	public Bottle bottle() {
		System.out.println("Register the bottle 4");
		Bottle bottle = new Bottle();
		return bottle;
	}

	@Bean
	public String bottleColor() {
		System.out.println("Register the bottleColor 5");
		return "Green";
	}

	@Bean
	public Slipper protect() {
		System.out.println("Register the Slipper 6");
		Slipper slipper = new Slipper();
		return slipper;
	}

	@Bean
	public double length() {
		System.out.println("Register the length 7");
		return 36;
	}

	@Bean
	public String name() {
		System.out.println("Register the name 8");
		Purifier purifier = new Purifier();
		return "Proplanate";
	}

	@Bean
	public String purifierColor() {
		System.out.println("Register the purifierColor 9");
		return "Black";
	}

	@Bean
	public double purifierPrice() {
		System.out.println("Register the purifierPrice 10");
		return 20000;
	}

	@Bean
	public boolean hotWater() {
		System.out.println("Register the hotWater 11");
		return true;
	}

	@Bean
	public int noOfPorts() {
		System.out.println("Register the noOfPorts 12");
		return 2;
	}

	@Bean
	public int noOfColors() {
		System.out.println("Register the noOfColors 13");
		return 2;
	}

	@Bean
	public Metro metro() {
		System.out.println("Register the metro 14");
		Metro metro1 = new Metro();
		metro1.setName("Namma-Metro");
		return metro1;
	}
	@Bean
	public int noOfLines() {
		System.out.println("Register the noOfLines: int 15");
		return 2;
	}
	@Bean
	public void transport() {
		System.out.println("Register the transport: void 16");
	}
	@Bean
	public void metroPlace() {
		System.out.println("Register the metroPlace: void 17");
	}
	@Bean
	public Colors colors() {
		System.out.println("Register the colors: Colors 18");
		Colors color = new Colors();
		return color;
	}
	@Bean
	public String red() {
		System.out.println("Register the colors: String 19");
		return "Red";
	}
	@Bean
	public String blue() {
	System.out.println("Register the blue 20");
	return "blue";
	}
	@Bean
	public String green() {
		System.out.println("Register the green 21");
		return "Green";
	}
	@Bean
	public String black() {
		System.out.println("Register the black 22");
		return "Black";
	}
	@Bean
	public String gray() {
		System.out.println("Register the gray 23");
		return "Gray";
	}
	@Bean
	public String white() {
		System.out.println("Register the white 24");
		return "White";
	}
	@Bean
	public String gold() {
		System.out.println("Register the gold 25");
		return "Gold";
	}
	@Bean
	public String pink() {
		System.out.println("Register the pink 26");
		return "Pink";
	}
	@Bean
	public String purple() {
		System.out.println("Register the purple 27");
		return "Purple";
	}
	@Bean
	public String parrotGreen() {
		System.out.println("Register the parrotGreen 28");
		return "ParrotGreen";
	}
	@Bean
	public String skyBlue() {
		System.out.println("Register the skyBlue 29");
		return "SkyBlue";
	}
	@Bean
	public String maroon() {
		System.out.println("Register the maroon 30");
		return "maroon";
	}
	@Bean
	public String yellow() {
		System.out.println("Register the yellow 31");
		return "yellow";
	}
	@Bean
	public String orange() {
		System.out.println("Register the orange 32");
		return "orange";
	}
	@Bean
	public String azure() {
		System.out.println("Register the azure 33");
		return "azure";
	}
	@Bean
	public String lime() {
		System.out.println("Register the lime 34");
		return "lime";
	}
	@Bean
	public String wheat() {
		System.out.println("Register the wheat 35");
		return "wheat";
	}
	@Bean
	public String salmon() {
		System.out.println("Register the salmon 36");
		return "salmon";
	}
	@Bean
	public String aqua() {
		System.out.println("Register the aqua 37");
		return "aqua";
	}
	@Bean
	public String navy() {
		System.out.println("Register the navy 38");
		return "navy";
	}
	@Bean
	public String teal() {
		System.out.println("Register the teal 39");
		return "teal";
	}
	@Bean
	public String silver() {
		System.out.println("Register the silver 40");
		return "silver";
	}
	@Bean
	public String bronze() {
		System.out.println("Register the bronze 41");
		return "bronze";
	}
	@Bean
	public String brown() {
		System.out.println("Register the brown 42");
		return "brown";
	}
	@Bean
	public String golden() {
		System.out.println("Register the golden 43");
		return "golden";
	}
	@Bean
	public String darkRed() {
		System.out.println("Register the darkRed 44");
		return "darkRed";
	}
	@Bean
	public String darkBlue() {
		System.out.println("Register the darkBlue 45");
		return "darkBlue";
	}
	@Bean
	public String chocolate() {
		System.out.println("Register the chocolate 46");
		return "chocolate";
	}
	@Bean
	public String springGreen() {
		System.out.println("Register the springGreen 47");
		return "springGreen";
	}
	@Bean
	public Animals animals () {
		System.out.println("Register the animals 48");
		Animals animal=new Animals();
		return animal;
	}
	@Bean
	public String giraffe() {
		System.out.println("Register the giraffe 49");
		return "giraffe";
	}
	@Bean
	public String fox() {
		System.out.println("Register the fox 50");
		return "fox";
	}
	@Bean
	public String tiger() {
		System.out.println("Register the tiger 51");
		return "tiger";
	}
	@Bean
	public String chimpanzee() {
		System.out.println("Register the chimpanzee 52");
		return "chimpanzee";
	}
	@Bean
	public String squirrel() {
		System.out.println("Register the squirrel :53");
		return "squirrel";
	}
	@Bean
	public String camel() {
		System.out.println("Register the camel :54");
		return "camel";
	}
	@Bean
	public String possum() {
		System.out.println("Register the possum: 55");
		return "possum";
	}
	@Bean
	public String lion() {
		System.out.println("Register the lion:56");
		return "lion";
	}
	@Bean
	public String deer() {
		System.out.println("Register the deer :57");
		return "deer";
	}
	@Bean
	public String monkey() {
		System.out.println("Register the monkey :58");
		return "monkey";
	}
	@Bean
	public String elephant() {
		System.out.println("Register the elephant :59");
		return "elephant";
	}
	@Bean
	public String mouse() {
		System.out.println("Register the mouse :60");
		return "mouse";
	}
	@Bean
	public String horse() {
		System.out.println("Register the horse :61");
		return "horse";
	}
	@Bean
	public String koala() {
		System.out.println("Register the koala: 62");
		return "koala";
	}
	@Bean
	public String kangaroo() {
		System.out.println("Register the kangaroo :63");
		return "kangaroo";
	}
	@Bean
	public String gorilla() {
		System.out.println("Register the gorilla :64");
		return "gorilla";
	}
	@Bean
	public String leopard() {
		System.out.println("Register the gorilla :65");
		return "gorilla";
	}
	@Bean
	public String otter() {
		System.out.println("Register the otter : 66");
		return "otter";
	}
	@Bean
	public String mole() {
		System.out.println("Register the mole:67");
		return "mole";
	}
	@Bean
	public String owl() {
		System.out.println("Register the owl:68");
		return "owl";
	}
	@Bean
	public String sheep() {
		System.out.println("Register the sheep:69");
		return "sheep";
	}
	@Bean
	public String goat() {
		System.out.println("Register the goat:70");
		return "goat";
	}
	@Bean
	public String panda() {
		System.out.println("Register the panda:71");
		return "panda";
	}
	@Bean
	public String rabbit() {
		System.out.println("Register the rabbit:72");
		return "rabbit";
	}
	@Bean
	public String zebra () {
		System.out.println("Register the zebra:73");
		return "zebra";
	}
	@Bean
	public String wolf() {
		System.out.println("Register the wolf :80");
		return "wolf";
	}
	@Bean
	public String bear() {
		System.out.println("Register the bear:81");
		return "bear";
	}
	@Bean
	public String cat() {
		System.out.println("Register the cat:82");
		return "cat";
	}
	@Bean
	public String dog() {
		System.out.println("Register the dog:83");
		return "dog";
	}
	@Bean
	public String cow() {
		System.out.println("Register the cow:84");
		return "cow";
	}
	@Bean
	public String duck() {
		System.out.println("Register the duck:85");
		return "duck";
	}
	@Bean
	public String pig() {
		System.out.println("Register the pig:86");
		return "pig";
	}
	@Bean
	public String rooster() {
		System.out.println("Register the rooster:87");
		return "rooster";
	}
	@Bean
	public String dove() {
		System.out.println("Register the dove:88");
		return "dove";
	}
	@Bean
	public String beaver() {
		System.out.println("Register the beaver:89");
		return "beaver";
	}
	@Bean
	public String ant() {
		System.out.println("Register the ant:90");
		return "ant";
	}
	@Bean
	public String bat() {
		System.out.println("Register the bat:91");
		return "bat";
	}
	@Bean
	public String bird() {
		System.out.println("Register the bird:92");
		return "bird";
	}
	@Bean
	public String buffalo() {
		System.out.println("Register the buffalo:93");
		return "buffalo";
	}
	@Bean
	public String camell() {
		System.out.println("Register the camell:94");
		return "camell";
	}
	@Bean
	public String bee() {
		System.out.println("Register the bee:95");
		return "bee";
	}
	@Bean
	public String dolphin() {
		System.out.println("Register the dolphin:96");
		return "dolphin";
	}
	@Bean
	public String scorpion() {
		System.out.println("Register the scorpion:97");
		return "scorpion";
	}
	@Bean
	public String slug() {
		System.out.println("Register the slug:98");
		return "slug";
	}
	@Bean
	public String oyster() {
		System.out.println("Register the oyster:99");
		return "oyster";
	}
	@Bean
	public String ox() {
		System.out.println("Register the ox:100");
		return "ox";
	}	
	@Bean
	public Numbers numbers() {
		System.out.println("Register the numbers : 101");
		Numbers numb=new Numbers();
		return numb;		
	}
	@Bean
	public Integer one() {
		System.out.println("Register the one");
		return 1;		
	}
	@Bean
	public Integer two() {
		System.out.println("Register the two");
		return 2;		
	}
	@Bean
	public Integer three() {
		System.out.println("Register the three");
		return 3;		
	}
	@Bean
	public Integer four() {
		System.out.println("Register the four");
		return 4;		
	}
	@Bean
	public Integer five() {
		System.out.println("Register the five");
		return 5;		
	}
	@Bean
	public Integer six() {
		System.out.println("Register the six");
		return 6;		
	}
	@Bean
	public Integer seven() {
		System.out.println("Register the seven");
		return 7;		
	}
	@Bean
	public Integer eight() {
		System.out.println("Register the eight");
		return 8;		
	}
	@Bean
	public Integer nine() {
		System.out.println("Register the nine");
		return 9;		
	}
	@Bean
	public Integer ten() {
		System.out.println("Register the ten");
		return 10;		
	}
	@Bean
	public Integer eleven() {
		System.out.println("Register the eleven");
		return 11;		
	}
	@Bean
	public Integer twelve() {
		System.out.println("Register the twelve");
		return 12;		
	}
	@Bean
	public Integer thirteen() {
		System.out.println("Register the thirteen");
		return 13;		
	}
	@Bean
	public Integer fourteen() {
		System.out.println("Register the fourteen");
		return 14;		
	}
	@Bean
	public Integer fifteen() {
		System.out.println("Register the fifteen");
		return 15;		
	}
	@Bean
	public Integer sixteen() {
		System.out.println("Register the sixteen");
		return 16;		
	}
	@Bean
	public Integer seventeen() {
		System.out.println("Register the seventeen");
		return 17;		
	}
	@Bean
	public Integer eighteen() {
		System.out.println("Register the eighteen");
		return 18;		
	}
	@Bean
	public Integer nineteen() {
		System.out.println("Register the nineteen");
		return 19;		
	}
	@Bean
	public Integer twenty() {
		System.out.println("Register the twenty");
		return 20;		
	}
	@Bean
	public Integer twentyOne() {
		System.out.println("Register the twentyOne");
		return 21;		
	}
	@Bean
	public Integer twentyTwo() {
		System.out.println("Register the twentyTwo");
		return 22;		
	}
	@Bean
	public Integer twentyThree() {
		System.out.println("Register the twentyThree");
		return 23;		
	}
	@Bean
	public Integer twentyFour() {
		System.out.println("Register the twentyFour");
		return 24;		
	}
	@Bean
	public Integer twentyFive() {
		System.out.println("Register the twentyFive");
		return 25;		
	}
	@Bean
	public Integer twentySix() {
		System.out.println("Register the twentySix");
		return 26;		
	}
	@Bean
	public Integer twentySeven() {
		System.out.println("Register the twentySeven");
		return 27;		
	}
	@Bean
	public Integer twentyEight() {
		System.out.println("Register the twentyEight");
		return 28;		
	}
	@Bean
	public Integer twentyNine() {
		System.out.println("Register the twentyNine");
		return 29;		
	}
	@Bean
	public Integer thirty() {
		System.out.println("Register the thirty");
		return 30;		
	}
	@Bean
	public Integer thirtyOne() {
		System.out.println("Register the thirtyOne");
		return 31;		
	}
	@Bean
	public Integer thirtyTwo() {
		System.out.println("Register the thirtyTwo");
		return 32;		
	}
	@Bean
	public Integer thirtyThree() {
		System.out.println("Register the thirtyThree");
		return 33;		
	}
	@Bean
	public Integer thirtyFour() {
		System.out.println("Register the thirtyFour");
		return 34;		
	}
	@Bean
	public Integer thirtyFive() {
		System.out.println("Register the thirtyFive");
		return 35;		
	}
	@Bean
	public Integer thirtySix() {
		System.out.println("Register the thirtySix");
		return 36;		
	}
	@Bean
	public Integer thirtySeven() {
		System.out.println("Register the thirtySeven");
		return 37;		
	}
	@Bean
	public Integer thirtyEight() {
		System.out.println("Register the thirtyEight");
		return 38;		
	}
	@Bean
	public Integer thirtyNine() {
		System.out.println("Register the thirtyNine");
		return 39;		
	}
	@Bean
	public Integer fourty() {
		System.out.println("Register the fourty");
		return 40;		
	}
	@Bean
	public Integer fourtyOne() {
		System.out.println("Register the fourtyOne");
		return 41;		
	}
	@Bean
	public Integer fourtyTwo() {
		System.out.println("Register the fourtyTwo");
		return 42;		
	}
	@Bean
	public Integer fourtyThree() {
		System.out.println("Register the fourtyThree");
		return 43;		
	}
	@Bean
	public Integer fourtyFour() {
		System.out.println("Register the fourtyFour");
		return 44;		
	}
	@Bean
	public Integer fourtyFive() {
		System.out.println("Register the fourtyFive");
		return 45;		
	}
	@Bean
	public Integer fourtySix() {
		System.out.println("Register the fourtySix");
		return 46;		
	}
	@Bean
	public Integer fourtySeven() {
		System.out.println("Register the fourtySeven");
		return 47;		
	}
	@Bean
	public Integer fourtyEight() {
		System.out.println("Register the fourtyEight");
		return 48;		
	}
	@Bean
	public Integer fourtyNine() {
		System.out.println("Register the fourtyNine");
		return 49;		
	}
	@Bean
	public Integer fifty() {
		System.out.println("Register the fifty");
		return 50;		
	}
	@Bean
	public Integer fiftyOne() {
		System.out.println("Register the fiftyOne");
		return 51;		
	}
	@Bean
	public Integer fiftyTwo() {
		System.out.println("Register the fiftyTwo");
		return 52;		
	}
	@Bean
	public Integer fiftyThree() {
		System.out.println("Register the fiftyThree");
		return 53;		
	}
	@Bean
	public Integer fiftyFour() {
		System.out.println("Register the fiftyFour");
		return 54;		
	}
	@Bean
	public Integer fiftyFive() {
		System.out.println("Register the fiftyFive");
		return 55;		
	}
	@Bean
	public Integer fiftySix() {
		System.out.println("Register the fiftySix");
		return 56;		
	}
	@Bean
	public Integer fiftySeven() {
		System.out.println("Register the fiftySeven");
		return 57;		
	}
	@Bean
	public Integer fiftyEight() {
		System.out.println("Register the fiftyEight");
		return 58;		
	}
	@Bean
	public Integer fiftyNine() {
		System.out.println("Register the fiftyNine");
		return 59;		
	}
	@Bean
	public Integer sixty() {
		System.out.println("Register the sixty");
		return 60;		
	}
	@Bean
	public Integer sixtyOne() {
		System.out.println("Register the sixtyOne");
		return 61;		
	}
	@Bean
	public Integer sixtyTwo() {
		System.out.println("Register the sixtyTwo");
		return 62;		
	}
	@Bean
	public Integer sixtyThree() {
		System.out.println("Register the sixtyThree");
		return 63;		
	}
	@Bean
	public Integer sixtyFour() {
		System.out.println("Register the sixtyFour");
		return 64;		
	}
	@Bean
	public Integer hundredOne() {
		System.out.println("Register the hundredOne");
		return 101;		
	}
	@Bean
	public Integer hundredTwo() {
		System.out.println("Register the hundredTwo");
		return 102;		
	}
	@Bean
	public Integer hundredThree() {
		System.out.println("Register the hundredThree");
		return 103;		
	}
	@Bean
	public Integer hundredFour() {
		System.out.println("Register the hundredFour");
		return 104;		
	}
	@Bean
	public Integer hundredFive() {
		System.out.println("Register the hundredFive");
		return 105;		
	}
	@Bean
	public Integer hundredSix() {
		System.out.println("Register the hundredSix");
		return 106;		
	}
	@Bean
	public Integer hundredSeven() {
		System.out.println("Register the hundredSeven");
		return 107;		
	}
	@Bean
	public Integer hundredEight() {
		System.out.println("Register the hundredEight");
		return 108;		
	}
	@Bean
	public Integer hundredNine() {
		System.out.println("Register the hundredNine");
		return 109;		
	}
	@Bean
	public Integer hundredTen() {
		System.out.println("Register the hundredTen");
		return 110;		
	}
	@Bean
	public Integer hundredEleven() {
		System.out.println("Register the hundredEleven");
		return 111;		
	}
	@Bean
	public Integer hundredTwelve() {
		System.out.println("Register the hundredTwelve");
		return 112;		
	}
	@Bean
	public Integer hundredThirteen() {
		System.out.println("Register the hundredThirteen");
		return 113;		
	}
	@Bean
	public Integer hundredFourteen() {
		System.out.println("Register the hundredFourteen");
		return 114;		
	}
	@Bean
	public Integer hundredFifteen() {
		System.out.println("Register the hundredFifteen");
		return 115;		
	}
	@Bean
	public Integer hundredSixteen() {
		System.out.println("Register the hundredSixteen");
		return 116;		
	}
	@Bean
	public Integer hundredSeventeen() {
		System.out.println("Register the hundredSeventeen");
		return 117;		
	}
	@Bean
	public Integer hundredEighteen() {
		System.out.println("Register the hundredEighteen");
		return 118;		
	}
	@Bean
	public Integer hundredNinteen() {
		System.out.println("Register the hundredNinteen");
		return 119;		
	}
	@Bean
	public Integer hundredTwenty() {
		System.out.println("Register the hundredTwenty");
		return 120;		
	}
	@Bean
	public Integer hundredTwentyOne() {
		System.out.println("Register the hundredTwentyone");
		return 121;		
	}
	@Bean
	public Integer hundredTwentyTwo() {
		System.out.println("Register the hundredTwentyTwo");
		return 122;		
	}
	@Bean
	public Integer hundredTwentyThree() {
		System.out.println("Register the hundredTwentyThree");
		return 123;		
	}
	@Bean
	public Integer hundredTwentyFour() {
		System.out.println("Register the hundredTwentyFour");
		return 124;		
	}
	@Bean
	public Integer hundredTwentyFive() {
		System.out.println("Register the hundredTwentyFive");
		return 125;		
	}
	@Bean
	public Integer hundredTwentysix() {
		System.out.println("Register the hundredTwentysix");
		return 126;		
	}
	@Bean
	public Integer hundredTwentySeven() {
		System.out.println("Register the hundredTwentySeven");
		return 127;		
	}
	@Bean
	public Integer hundredTwentyEight() {
		System.out.println("Register the hundredTwentyEight");
		return 128;		
	}
	@Bean
	public Integer hundredTwentyNine() {
		System.out.println("Register the hundredTwentyNine");
		return 129;		
	}
	@Bean
	public Integer hundredThirty() {
		System.out.println("Register the hundredThirty");
		return 130;		
	}
	@Bean
	public Integer hundredThirtyOne() {
		System.out.println("Register the hundredThirtyOne");
		return 131;		
	}
	@Bean
	public Integer hundredThirtyTwo() {
		System.out.println("Register the hundredThirtyTwo");
		return 132;		
	}
	@Bean
	public Integer hundredThirtyThree() {
		System.out.println("Register the hundredThirtyThree");
		return 133;		
	}
	@Bean
	public Integer hundredThirtyFour() {
		System.out.println("Register the hundredThirtyFour");
		return 134;		
	}
	@Bean
	public Integer hundredThirtyFive() {
		System.out.println("Register the hundredThirtyFive");
		return 135;		
	}
	@Bean
	public Integer hundredThirtySix() {
		System.out.println("Register the hundredThirtySix");
		return 136;		
	}
	@Bean
	public Integer hundredThirtySeven() {
		System.out.println("Register the hundredThirtySeven");
		return 137;		
	}
	@Bean
	public Integer hundredThirtyEight() {
		System.out.println("Register the hundredThirtyEight");
		return 138;		
	}
	@Bean
	public Integer hundredFourty() {
		System.out.println("Register the hundredFourty");
		return 140;		
	}
	@Bean
	public Integer hundredFourtyOne() {
		System.out.println("Register the hundredFourtyOne");
		return 141;		
	}
	@Bean
	public Integer hundredFourtyTwo() {
		System.out.println("Register the hundredFourtyTwo");
		return 142;		
	}
	@Bean
	public Integer hundredFourtyThree() {
		System.out.println("Register the hundredFourtyThree");
		return 143;		
	}
	@Bean
	public Integer hundredFourtyFour() {
		System.out.println("Register the hundredFourtyFour");
		return 144;		
	}
	@Bean
	public Integer hundredFourtyFive() {
		System.out.println("Register the hundredFourtyFive");
		return 145;		
	}
	@Bean
	public Integer hundredFourtySix() {
		System.out.println("Register the hundredFourtySix");
		return 146;		
	}
	@Bean
	public Integer hundredFourtySeven() {
		System.out.println("Register the hundredFourtySeven");
		return 147;		
	}
	@Bean
	public Integer hundredFourtyEight() {
		System.out.println("Register the hundredFourtyEight");
		return 148;		
	}
	@Bean
	public Integer hundredFourtyNine() {
		System.out.println("Register the hundredFourtyNine");
		return 149;		
	}
	@Bean
	public Integer hundredFifty() {
		System.out.println("Register the hundredFifty");
		return 150;		
	}
	@Bean
	public Integer hundredFiftyOne() {
		System.out.println("Register the hundredFiftyOne");
		return 151;		
	}
	@Bean
	public Integer hundredFiftyTwo() {
		System.out.println("Register the hundredFiftyTwo");
		return 152;		
	}
	@Bean
	public Integer hundredFiftyThree() {
		System.out.println("Register the hundredFiftyThree");
		return 153;		
	}
	@Bean
	public Integer hundredFiftyFour() {
		System.out.println("Register the hundredFiftyFour");
		return 154;		
	}
	@Bean
	public Integer hundredFiftyFive() {
		System.out.println("Register the hundredFiftyFive");
		return 155;		
	}
	@Bean
	public Integer hundredFiftySix() {
		System.out.println("Register the hundredFiftySix");
		return 156;		
	}
	@Bean
	public Integer hundredFiftySeven() {
		System.out.println("Register the hundredFiftySeven");
		return 157;		
	}
	@Bean
	public Integer hundredFiftyEight() {
		System.out.println("Register the hundredFiftyEight");
		return 158;		
	}
	@Bean
	public Integer hundredFiftyNine() {
		System.out.println("Register the hundredFiftyNine");
		return 159;		
	}
	@Bean
	public Integer hundredSixty() {
		System.out.println("Register the hundredSixty");
		return 160;		
	}
	@Bean
	public Integer hundredSixtyOne() {
		System.out.println("Register the hundredSixtyOne");
		return 161;		
	}
	@Bean
	public Integer hundredSixtyTwo() {
		System.out.println("Register the hundredSixtyTwo");
		return 162;		
	}
	@Bean
	public Integer hundredSixtyThree() {
		System.out.println("Register the hundredSixtyThree");
		return 163;		
	}
	@Bean
	public Integer hundredSixtyFour() {
		System.out.println("Register the hundredSixtyFour");
		return 164;		
	}
	@Bean
	public Integer hundredSixtyFive() {
		System.out.println("Register the hundredSixtyFive");
		return 165;		
	}
	@Bean
	public Integer hundredSixtySix() {
		System.out.println("Register the hundredSixtySix");
		return 166;		
	}
	@Bean
	public Integer hundredSixtySeven() {
		System.out.println("Register the hundredSixtySeven");
		return 167;		
	}
	@Bean
	public Integer hundredSixtyEight() {
		System.out.println("Register the hundredSixtyEight");
		return 168;		
	}
	@Bean
	public Integer hundredSixtyNine() {
		System.out.println("Register the hundredSixtyNine");
		return 169;		
	}
	@Bean
	public Integer hundredSeventy() {
		System.out.println("Register the hundredSeventy");
		return 170;		
	}
	@Bean
	public Integer hundredSeventyOne() {
		System.out.println("Register the hundredSeventyOne");
		return 171;		
	}
	@Bean
	public Integer hundredSeventyTwo() {
		System.out.println("Register the hundredSeventyTwo");
		return 172;		
	}
	@Bean
	public Integer hundredSeventyThree() {
		System.out.println("Register the hundredSeventyThree");
		return 173;		
	}
	@Bean
	public Integer hundredSeventyFour() {
		System.out.println("Register the hundredSeventyFour");
		return 174;		
	}
	@Bean
	public Integer hundredSeventyFive() {
		System.out.println("Register the hundredSeventyFive");
		return 175;		
	}
	@Bean
	public Integer hundredSeventySix() {
		System.out.println("Register the hundredSeventySix");
		return 176;		
	}
	@Bean
	public Integer hundredSeventySeven() {
		System.out.println("Register the hundredSeventySeven");
		return 177;		
	}
	@Bean
	public Integer hundredSeventyEight() {
		System.out.println("Register the hundredSeventyEight");
		return 178;		
	}
	@Bean
	public Integer hundredSeventyNine() {
		System.out.println("Register the hundredSeventyNine");
		return 179;		
	}
	@Bean
	public Integer hundredEighty() {
		System.out.println("Register the hundredEighty");
		return 180;		
	}
	@Bean
	public Integer hundredEightyOne() {
		System.out.println("Register the hundredEightyOne");
		return 181;		
	}
	@Bean
	public Integer hundredEightyTwo() {
		System.out.println("Register the hundredEightyTwo");
		return 182;		
	}
	@Bean
	public Integer hundredEightyThree() {
		System.out.println("Register the hundredEightyThree");
		return 183;		
	}
	@Bean
	public Integer hundredEightyFour() {
		System.out.println("Register the hundredEightyFour");
		return 184;		
	}
	@Bean
	public Integer hundredEightyFive() {
		System.out.println("Register the hundredEightyFive");
		return 185;		
	}
	@Bean
	public Integer hundredEightySix() {
		System.out.println("Register the hundredEightySix");
		return 186;		
	}
	@Bean
	public Integer hundredEightySeven() {
		System.out.println("Register the hundredEightySeven");
		return 187;		
	}
	@Bean
	public Integer hundredEightyEight() {
		System.out.println("Register the hundredEightyEight");
		return 188;		
	}
	@Bean
	public Integer hundredEightyNine() {
		System.out.println("Register the hundredEightyNine");
		return 189;		
	}
	@Bean
	public Integer hundredNinty() {
		System.out.println("Register the hundredNinty");
		return 190;		
	}
	@Bean
	public Integer hundredNintyOne() {
		System.out.println("Register the hundredNintyOne");
		return 191;		
	}
	@Bean
	public Integer hundredNintyTwo() {
		System.out.println("Register the hundredNintyTwo");
		return 192;		
	}
	@Bean
	public Integer hundredNintyThree() {
		System.out.println("Register the hundredNintyThree");
		return 193;		
	}
	@Bean
	public Integer hundredNintyFour() {
		System.out.println("Register the hundredNintyFour");
		return 194;		
	}
	@Bean
	public Integer hundredNintyFive() {
		System.out.println("Register the hundredNintyFive");
		return 195;		
	}
	@Bean
	public Integer hundredNintySix() {
		System.out.println("Register the hundredNintySix");
		return 196;		
	}
	@Bean
	public Integer hundredNintySeven() {
		System.out.println("Register the hundredNintySeven");
		return 197;		
	}
	@Bean
	public Integer hundredNintyEight() {
		System.out.println("Register the hundredNintyEight");
		return 198;		
	}
	@Bean
	public Integer hundredNintyNine() {
		System.out.println("Register the hundredNintyNine");
		return 199;		
	}
	@Bean
	public Integer twoHundred() {
		System.out.println("Register the twoHundred");
		return 200;		
	}
	@Bean
	public Integer twoHundredOne() {
		System.out.println("Register the twoHundredOne");
		return 201;		
	}
	@Bean
	public Integer twoHundredTwo() {
		System.out.println("Register the twoHundredTwo");
		return 202;		
	}
	@Bean
	public Integer twoHundredThree() {
		System.out.println("Register the twoHundredThree");
		return 203;		
	}
	@Bean
	public Integer twoHundredFour() {
		System.out.println("Register the twoHundredFour");
		return 204;		
	}
	@Bean
	public Integer twoHundredFive() {
		System.out.println("Register the twoHundredFive");
		return 205;		
	}
	@Bean
	public Integer twoHundredSix() {
		System.out.println("Register the twoHundredSix");
		return 206;		
	}
	@Bean
	public Integer twoHundredSeven() {
		System.out.println("Register the twoHundredSeven");
		return 207;		
	}
	@Bean
	public Integer twoHundredEight() {
		System.out.println("Register the twoHundredEight");
		return 208;		
	}
	@Bean
	public Integer twoHundredNine() {
		System.out.println("Register the twoHundredNine");
		return 209;		
	}
	@Bean
	public Integer twoHundredTen() {
		System.out.println("Register the twoHundredTen");
		return 210;		
	}
	@Bean
	public Integer twoHundredEleven() {
		System.out.println("Register the twoHundredEleven");
		return 211;		
	}
	@Bean
	public Integer twoHundredTwelve() {
		System.out.println("Register the twoHundredTwelve");
		return 212;		
	}
	@Bean
	public Integer twoHundredThirteen() {
		System.out.println("Register the twoHundredThirteen");
		return 213;		
	}
	@Bean
	public Integer twoHundredFourteen() {
		System.out.println("Register the twoHundredFourteen");
		return 214;		
	}
	@Bean
	public Integer twoHundredFifteen() {
		System.out.println("Register the twoHundredFifteen");
		return 215;		
	}
	@Bean
	public Integer twoHundredSixteen() {
		System.out.println("Register the twoHundredSixteen");
		return 216;		
	}
	@Bean
	public Integer twoHundredSeventeen() {
		System.out.println("Register the twoHundredSeventeen");
		return 217;		
	}
	@Bean
	public Integer twoHundredEighteen() {
		System.out.println("Register the twoHundredEighteen");
		return 218;		
	}
	@Bean
	public Integer twoHundredNinteen() {
		System.out.println("Register the twoHundredNinteen");
		return 219;		
	}
	@Bean
	public Integer twoHundredTwenty() {
		System.out.println("Register the twoHundredTwenty");
		return 220;		
	}
	@Bean
	public Integer twoHundredTwentyOne() {
		System.out.println("Register the twoHundredTwentyOne");
		return 221;		
	}
	@Bean
	public Integer twoHundredTwentyTwo() {
		System.out.println("Register the twoHundredTwentyTwo");
		return 222;		
	}
	@Bean
	public Integer twoHundredTwentyThree() {
		System.out.println("Register the twoHundredTwentyThree");
		return 223;		
	}
	@Bean
	public Integer twoHundredTwentyFour() {
		System.out.println("Register the twoHundredTwentyFour");
		return 224;		
	}
	@Bean
	public Integer twoHundredTwentyFive() {
		System.out.println("Register the twoHundredTwentyFive");
		return 225;		
	}
	@Bean
	public Integer twoHundredTwentySix() {
		System.out.println("Register the twoHundredTwentySix");
		return 226;		
	}
	@Bean
	public Integer twoHundredTwentySeven() {
		System.out.println("Register the twoHundredTwentySeven");
		return 227;		
	}
	@Bean
	public Integer twoHundredTwentyEight() {
		System.out.println("Register the twoHundredTwentyEight");
		return 228;		
	}
	@Bean
	public Integer twoHundredTwentyNine() {
		System.out.println("Register the twoHundredTwentyNine");
		return 229;		
	}
	@Bean
	public Integer twoHundredThirty() {
		System.out.println("Register the twoHundredThirty");
		return 230;		
	}
	@Bean
	public Integer twoHundredThirtyOne() {
		System.out.println("Register the twoHundredThirtyOne");
		return 231;		
	}
	@Bean
	public Integer twoHundredThirtyTwo() {
		System.out.println("Register the twoHundredThirtyTwo");
		return 232;		
	}
	@Bean
	public Integer twoHundredThirtyThirteen() {
		System.out.println("Register the twoHundredThirtyThirteen");
		return 233;		
	}
	@Bean
	public Integer twoHundredThirtyFour() {
		System.out.println("Register the twoHundredThirtyFour");
		return 234;		
	}
	@Bean
	public Integer twoHundredThirtyFive() {
		System.out.println("Register the twoHundredThirtyFive");
		return 235;		
	}
	@Bean
	public Integer twoHundredThirtySix() {
		System.out.println("Register the twoHundredThirtySix");
		return 236;		
	}
	@Bean
	public Integer twoHundredThirtySeven() {
		System.out.println("Register the twoHundredThirtySeven");
		return 237;		
	}
	@Bean
	public Integer twoHundredThirtyEight() {
		System.out.println("Register the twoHundredThirtyEight");
		return 238;		
	}
	@Bean
	public Integer twoHundredThirtyNine() {
		System.out.println("Register the twoHundredThirtyNine");
		return 239;		
	}
	@Bean
	public Integer twoHundredFourty() {
		System.out.println("Register the one");
		return 240;		
	}
	@Bean
	public Integer twoHundredFourtyOne() {
		System.out.println("Register the twoHundredFourtyOne");
		return 241;		
	}
	@Bean
	public Integer twoHundredFourtyTwo() {
		System.out.println("Register the twoHundredFourtyTwo");
		return 242;		
	}
	@Bean
	public Integer twoHundredFourtyThree() {
		System.out.println("Register the twoHundredFourtyThree");
		return 243;		
	}
	@Bean
	public Integer twoHundredFourtyFour() {
		System.out.println("Register the twoHundredFourtyFour");
		return 244;		
	}
	@Bean
	public Integer twoHundredFourtyFive() {
		System.out.println("Register the twoHundredFourtyFive");
		return 245;		
	}
	@Bean
	public Integer twoHundredFourtySix() {
		System.out.println("Register the twoHundredFourtySix");
		return 246;		
	}
	@Bean
	public Integer twoHundredFourtySeven() {
		System.out.println("Register the twoHundredFourtySeven");
		return 247;		
	}
	@Bean
	public Integer twoHundredFourtyEight() {
		System.out.println("Register the twoHundredFourtyEight");
		return 248;		
	}
	@Bean
	public Integer twoHundredFourtyNine() {
		System.out.println("Register the twoHundredFourtyNine");
		return 249;		
	}
	@Bean
	public Integer twoHundredFifty() {
		System.out.println("Register the twoHundredFifty");
		return 250;		
	}
	@Bean
	public Integer twoHundredFiftyOne() {
		System.out.println("Register the twoHundredFiftyOne");
		return 251;		
	}
	@Bean
	public Integer twoHundredFiftyTwo() {
		System.out.println("Register the twoHundredFiftyTwo");
		return 252;		
	}
	@Bean
	public Integer twoHundredFiftyThree() {
		System.out.println("Register the twoHundredFiftyThree");
		return 253;		
	}
	@Bean
	public Integer twoHundredFiftyFour() {
		System.out.println("Register the twoHundredFiftyFour");
		return 254;		
	}
	@Bean
	public Integer twoHundredFiftyFive() {
		System.out.println("Register the twoHundredFiftyFive");
		return 255;		
	}
	@Bean
	public Integer twoHundredFiftySix() {
		System.out.println("Register the twoHundredFiftySix");
		return 256;		
	}
	@Bean
	public Integer twoHundredFiftySeven() {
		System.out.println("Register the twoHundredFiftySeven");
		return 257;		
	}
	@Bean
	public Integer twoHundredFiftyEight() {
		System.out.println("Register the twoHundredFiftyEight");
		return 258;		
	}
	@Bean
	public Integer twoHundredFiftyNine() {
		System.out.println("Register the twoHundredFiftyNine");
		return 259;		
	}
	@Bean
	public Integer twoHundredSixty() {
		System.out.println("Register the twoHundredSixty");
		return 260;		
	}
	@Bean
	public Integer twoHundredSixtyOne() {
		System.out.println("Register the twoHundredSixtyOne");
		return 261;		
	}
	@Bean
	public Integer twoHundredSixtyTwo() {
		System.out.println("Register the twoHundredSixtyTwo");
		return 262;		
	}
	@Bean
	public Integer twoHundredSixtyThree() {
		System.out.println("Register the twoHundredSixtyThree");
		return 263;		
	}
	@Bean
	public Integer twoHundredSixtyFour() {
		System.out.println("Register the twoHundredSixtyFour");
		return 264;		
	}
	@Bean
	public Integer twoHundredSixtyFive() {
		System.out.println("Register the twoHundredSixtyFive");
		return 265;		
	}
	@Bean
	public Integer twoHundredSixtySix() {
		System.out.println("Register the twoHundredSixtySix");
		return 266;		
	}
	@Bean
	public Integer twoHundredSixtySeven() {
		System.out.println("Register the twoHundredSixtySeven");
		return 267;		
	}
	@Bean
	public Integer twoHundredSixtyEight() {
		System.out.println("Register the twoHundredSixtyEight");
		return 268;		
	}
	@Bean
	public Integer twoHundredSixtyNine() {
		System.out.println("Register the twoHundredSixtyNine");
		return 269;		
	}
	@Bean
	public Integer twoHundredSeventy() {
		System.out.println("Register the twoHundredSeventy");
		return 270;		
	}
	@Bean
	public Integer twoHundredSeventyOne() {
		System.out.println("Register the twoHundredSeventyOne");
		return 271;		
	}
	@Bean
	public Integer twoHundredSeventyTwo() {
		System.out.println("Register the twoHundredSeventyTwo");
		return 272;		
	}
	@Bean
	public Integer twoHundredSeventyThree() {
		System.out.println("Register the twoHundredSeventyThree");
		return 273;		
	}
	@Bean
	public Integer twoHundredSeventyFour() {
		System.out.println("Register the twoHundredSeventyFour");
		return 274;		
	}
	@Bean
	public Integer twoHundredSeventyFive() {
		System.out.println("Register the twoHundredSeventyFive");
		return 275;		
	}
	@Bean
	public Integer twoHundredSeventySix() {
		System.out.println("Register the twoHundredSeventySix");
		return 276;		
	}
	@Bean
	public Integer twoHundredSeventySeven() {
		System.out.println("Register the twoHundredSeventySeven");
		return 277;		
	}
	@Bean
	public Integer twoHundredSeventyEight() {
		System.out.println("Register the twoHundredSeventyEight");
		return 278;		
	}
	@Bean
	public Integer twoHundredSeventyNine() {
		System.out.println("Register the twoHundredSeventyNine");
		return 279;		
	}
	@Bean
	public Integer twoHundredEighty() {
		System.out.println("Register the twoHundredEighty");
		return 280;		
	}
	@Bean
	public Integer twoHundredEightyOne() {
		System.out.println("Register the twoHundredEightyOne");
		return 281;		
	}
	@Bean
	public Integer twoHundredEightyTwo() {
		System.out.println("Register the twoHundredEightyTwo");
		return 282;		
	}
	@Bean
	public Integer twoHundredEightyThree() {
		System.out.println("Register the twoHundredEightyThree");
		return 283;		
	}
	@Bean
	public Integer twoHundredEightyFour() {
		System.out.println("Register the twoHundredEightyFour");
		return 284;		
	}
	@Bean
	public Integer twoHundredEightyFive() {
		System.out.println("Register the twoHundredEightyFive");
		return 285;		
	}
	@Bean
	public Integer twoHundredEightySix() {
		System.out.println("Register the twoHundredEightySix");
		return 286;		
	}
	@Bean
	public Integer twoHundredEightySeven() {
		System.out.println("Register the twoHundredEightySeven");
		return 287;		
	}
	@Bean
	public Integer twoHundredEightyEight() {
		System.out.println("Register the twoHundredEightyEight");
		return 288;		
	}
	@Bean
	public Integer twoHundredEightyNine() {
		System.out.println("Register the twoHundredEightyNine");
		return 289;		
	}
	@Bean
	public Integer twoHundredNinty() {
		System.out.println("Register the twoHundredNinty");
		return 290;		
	}
	@Bean
	public Integer twoHundredNintyOne() {
		System.out.println("Register the twoHundredNintyOne");
		return 291;		
	}
	@Bean
	public Integer twoHundredNintyTwo() {
		System.out.println("Register the twoHundredNintyTwo");
		return 292;		
	}
	@Bean
	public Integer twoHundredNintyThree() {
		System.out.println("Register the twoHundredNintyThree");
		return 293;		
	}
	@Bean
	public Integer twoHundredNintyFour() {
		System.out.println("Register the twoHundredNintyFour");
		return 294;		
	}
	@Bean
	public Integer twoHundredNintyFive() {
		System.out.println("Register the twoHundredNintyFive");
		return 295;		
	}
	@Bean
	public Integer twoHundredNintySix() {
		System.out.println("Register the twoHundredNintySix");
		return 296;		
	}
	@Bean
	public Integer twoHundredNintySeven() {
		System.out.println("Register the twoHundredNintySeven");
		return 297;		
	}
	@Bean
	public Integer twoHundredNintyEight() {
		System.out.println("Register the twoHundredNintyEight");
		return 298;		
	}
	@Bean
	public Integer twoHundredNintyNine() {
		System.out.println("Register the twoHundredNintyNine");
		return 299;		
	}
	@Bean
	public Integer threeHundred() {
		System.out.println("Register the threeHundred");
		return 300;		
	}
	
}

