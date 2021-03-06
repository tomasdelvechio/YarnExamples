/*
 * Copyright (C) 2014 tomas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package indexingCommons;

import java.util.HashSet;

/**
 *
 * @author tomas
 */
public class StopWords {
    
    HashSet<String> stopWords;
    
    public StopWords() {
        
        this.stopWords = new HashSet<String>();
        this.stopWords.add("x");
        this.stopWords.add("y");
        this.stopWords.add("your");
        this.stopWords.add("yours");
        this.stopWords.add("yourself");
        this.stopWords.add("yourselves");
        this.stopWords.add("you");
        this.stopWords.add("yond");
        this.stopWords.add("yonder");
        this.stopWords.add("yon");
        this.stopWords.add("ye");
        this.stopWords.add("yet");
        this.stopWords.add("z");
        this.stopWords.add("zillion");
        this.stopWords.add("j");
        this.stopWords.add("u");
        this.stopWords.add("umpteen");
        this.stopWords.add("usually");
        this.stopWords.add("us");
        this.stopWords.add("username");
        this.stopWords.add("uponed");
        this.stopWords.add("upons");
        this.stopWords.add("uponing");
        this.stopWords.add("upon");
        this.stopWords.add("ups");
        this.stopWords.add("upping");
        this.stopWords.add("upped");
        this.stopWords.add("up");
        this.stopWords.add("unto");
        this.stopWords.add("until");
        this.stopWords.add("unless");
        this.stopWords.add("unlike");
        this.stopWords.add("unliker");
        this.stopWords.add("unlikest");
        this.stopWords.add("under");
        this.stopWords.add("underneath");
        this.stopWords.add("use");
        this.stopWords.add("used");
        this.stopWords.add("usedest");
        this.stopWords.add("r");
        this.stopWords.add("rath");
        this.stopWords.add("rather");
        this.stopWords.add("rathest");
        this.stopWords.add("rathe");
        this.stopWords.add("re");
        this.stopWords.add("relate");
        this.stopWords.add("related");
        this.stopWords.add("relatively");
        this.stopWords.add("regarding");
        this.stopWords.add("really");
        this.stopWords.add("res");
        this.stopWords.add("respecting");
        this.stopWords.add("respectively");
        this.stopWords.add("q");
        this.stopWords.add("quite");
        this.stopWords.add("que");
        this.stopWords.add("qua");
        this.stopWords.add("n");
        this.stopWords.add("neither");
        this.stopWords.add("neaths");
        this.stopWords.add("neath");
        this.stopWords.add("nethe");
        this.stopWords.add("nethermost");
        this.stopWords.add("necessary");
        this.stopWords.add("necessariest");
        this.stopWords.add("necessarier");
        this.stopWords.add("never");
        this.stopWords.add("nevertheless");
        this.stopWords.add("nigh");
        this.stopWords.add("nighest");
        this.stopWords.add("nigher");
        this.stopWords.add("nine");
        this.stopWords.add("noone");
        this.stopWords.add("nobody");
        this.stopWords.add("nobodies");
        this.stopWords.add("nowhere");
        this.stopWords.add("nowheres");
        this.stopWords.add("no");
        this.stopWords.add("noes");
        this.stopWords.add("nor");
        this.stopWords.add("nos");
        this.stopWords.add("no-one");
        this.stopWords.add("none");
        this.stopWords.add("not");
        this.stopWords.add("notwithstanding");
        this.stopWords.add("nothings");
        this.stopWords.add("nothing");
        this.stopWords.add("nathless");
        this.stopWords.add("natheless");
        this.stopWords.add("t");
        this.stopWords.add("ten");
        this.stopWords.add("tills");
        this.stopWords.add("till");
        this.stopWords.add("tilled");
        this.stopWords.add("tilling");
        this.stopWords.add("to");
        this.stopWords.add("towards");
        this.stopWords.add("toward");
        this.stopWords.add("towardest");
        this.stopWords.add("towarder");
        this.stopWords.add("together");
        this.stopWords.add("too");
        this.stopWords.add("thy");
        this.stopWords.add("thyself");
        this.stopWords.add("thus");
        this.stopWords.add("than");
        this.stopWords.add("that");
        this.stopWords.add("those");
        this.stopWords.add("thou");
        this.stopWords.add("though");
        this.stopWords.add("thous");
        this.stopWords.add("thouses");
        this.stopWords.add("thoroughest");
        this.stopWords.add("thorougher");
        this.stopWords.add("thorough");
        this.stopWords.add("thoroughly");
        this.stopWords.add("thru");
        this.stopWords.add("thruer");
        this.stopWords.add("thruest");
        this.stopWords.add("thro");
        this.stopWords.add("through");
        this.stopWords.add("throughout");
        this.stopWords.add("throughest");
        this.stopWords.add("througher");
        this.stopWords.add("thine");
        this.stopWords.add("this");
        this.stopWords.add("thises");
        this.stopWords.add("they");
        this.stopWords.add("thee");
        this.stopWords.add("the");
        this.stopWords.add("then");
        this.stopWords.add("thence");
        this.stopWords.add("thenest");
        this.stopWords.add("thener");
        this.stopWords.add("them");
        this.stopWords.add("themselves");
        this.stopWords.add("these");
        this.stopWords.add("therer");
        this.stopWords.add("there");
        this.stopWords.add("thereby");
        this.stopWords.add("therest");
        this.stopWords.add("thereafter");
        this.stopWords.add("therein");
        this.stopWords.add("thereupon");
        this.stopWords.add("therefore");
        this.stopWords.add("their");
        this.stopWords.add("theirs");
        this.stopWords.add("thing");
        this.stopWords.add("things");
        this.stopWords.add("three");
        this.stopWords.add("two");
        this.stopWords.add("o");
        this.stopWords.add("oh");
        this.stopWords.add("owt");
        this.stopWords.add("owning");
        this.stopWords.add("owned");
        this.stopWords.add("own");
        this.stopWords.add("owns");
        this.stopWords.add("others");
        this.stopWords.add("other");
        this.stopWords.add("otherwise");
        this.stopWords.add("otherwisest");
        this.stopWords.add("otherwiser");
        this.stopWords.add("of");
        this.stopWords.add("often");
        this.stopWords.add("oftener");
        this.stopWords.add("oftenest");
        this.stopWords.add("off");
        this.stopWords.add("offs");
        this.stopWords.add("offest");
        this.stopWords.add("one");
        this.stopWords.add("ought");
        this.stopWords.add("oughts");
        this.stopWords.add("our");
        this.stopWords.add("ours");
        this.stopWords.add("ourselves");
        this.stopWords.add("ourself");
        this.stopWords.add("out");
        this.stopWords.add("outest");
        this.stopWords.add("outed");
        this.stopWords.add("outwith");
        this.stopWords.add("outs");
        this.stopWords.add("outside");
        this.stopWords.add("over");
        this.stopWords.add("overallest");
        this.stopWords.add("overaller");
        this.stopWords.add("overalls");
        this.stopWords.add("overall");
        this.stopWords.add("overs");
        this.stopWords.add("or");
        this.stopWords.add("orer");
        this.stopWords.add("orest");
        this.stopWords.add("on");
        this.stopWords.add("oneself");
        this.stopWords.add("onest");
        this.stopWords.add("ons");
        this.stopWords.add("onto");
        this.stopWords.add("a");
        this.stopWords.add("atween");
        this.stopWords.add("at");
        this.stopWords.add("athwart");
        this.stopWords.add("atop");
        this.stopWords.add("afore");
        this.stopWords.add("afterward");
        this.stopWords.add("afterwards");
        this.stopWords.add("after");
        this.stopWords.add("afterest");
        this.stopWords.add("afterer");
        this.stopWords.add("ain");
        this.stopWords.add("an");
        this.stopWords.add("any");
        this.stopWords.add("anything");
        this.stopWords.add("anybody");
        this.stopWords.add("anyone");
        this.stopWords.add("anyhow");
        this.stopWords.add("anywhere");
        this.stopWords.add("anent");
        this.stopWords.add("anear");
        this.stopWords.add("and");
        this.stopWords.add("andor");
        this.stopWords.add("another");
        this.stopWords.add("around");
        this.stopWords.add("ares");
        this.stopWords.add("are");
        this.stopWords.add("aest");
        this.stopWords.add("aer");
        this.stopWords.add("against");
        this.stopWords.add("again");
        this.stopWords.add("accordingly");
        this.stopWords.add("abaft");
        this.stopWords.add("abafter");
        this.stopWords.add("abaftest");
        this.stopWords.add("abovest");
        this.stopWords.add("above");
        this.stopWords.add("abover");
        this.stopWords.add("abouter");
        this.stopWords.add("aboutest");
        this.stopWords.add("about");
        this.stopWords.add("aid");
        this.stopWords.add("amidst");
        this.stopWords.add("amid");
        this.stopWords.add("among");
        this.stopWords.add("amongst");
        this.stopWords.add("apartest");
        this.stopWords.add("aparter");
        this.stopWords.add("apart");
        this.stopWords.add("appeared");
        this.stopWords.add("appears");
        this.stopWords.add("appear");
        this.stopWords.add("appearing");
        this.stopWords.add("appropriating");
        this.stopWords.add("appropriate");
        this.stopWords.add("appropriatest");
        this.stopWords.add("appropriates");
        this.stopWords.add("appropriater");
        this.stopWords.add("appropriated");
        this.stopWords.add("already");
        this.stopWords.add("always");
        this.stopWords.add("also");
        this.stopWords.add("along");
        this.stopWords.add("alongside");
        this.stopWords.add("although");
        this.stopWords.add("almost");
        this.stopWords.add("all");
        this.stopWords.add("allest");
        this.stopWords.add("aller");
        this.stopWords.add("allyou");
        this.stopWords.add("alls");
        this.stopWords.add("albeit");
        this.stopWords.add("awfully");
        this.stopWords.add("as");
        this.stopWords.add("aside");
        this.stopWords.add("asides");
        this.stopWords.add("aslant");
        this.stopWords.add("ases");
        this.stopWords.add("astrider");
        this.stopWords.add("astride");
        this.stopWords.add("astridest");
        this.stopWords.add("astraddlest");
        this.stopWords.add("astraddler");
        this.stopWords.add("astraddle");
        this.stopWords.add("availablest");
        this.stopWords.add("availabler");
        this.stopWords.add("available");
        this.stopWords.add("aughts");
        this.stopWords.add("aught");
        this.stopWords.add("vs");
        this.stopWords.add("v");
        this.stopWords.add("variousest");
        this.stopWords.add("variouser");
        this.stopWords.add("various");
        this.stopWords.add("via");
        this.stopWords.add("vis-a-vis");
        this.stopWords.add("vis-a-viser");
        this.stopWords.add("vis-a-visest");
        this.stopWords.add("viz");
        this.stopWords.add("very");
        this.stopWords.add("veriest");
        this.stopWords.add("verier");
        this.stopWords.add("versus");
        this.stopWords.add("k");
        this.stopWords.add("g");
        this.stopWords.add("go");
        this.stopWords.add("gone");
        this.stopWords.add("good");
        this.stopWords.add("got");
        this.stopWords.add("gotta");
        this.stopWords.add("gotten");
        this.stopWords.add("get");
        this.stopWords.add("gets");
        this.stopWords.add("getting");
        this.stopWords.add("b");
        this.stopWords.add("by");
        this.stopWords.add("byandby");
        this.stopWords.add("by-and-by");
        this.stopWords.add("bist");
        this.stopWords.add("both");
        this.stopWords.add("but");
        this.stopWords.add("buts");
        this.stopWords.add("be");
        this.stopWords.add("beyond");
        this.stopWords.add("because");
        this.stopWords.add("became");
        this.stopWords.add("becomes");
        this.stopWords.add("become");
        this.stopWords.add("becoming");
        this.stopWords.add("becomings");
        this.stopWords.add("becominger");
        this.stopWords.add("becomingest");
        this.stopWords.add("behind");
        this.stopWords.add("behinds");
        this.stopWords.add("before");
        this.stopWords.add("beforehand");
        this.stopWords.add("beforehandest");
        this.stopWords.add("beforehander");
        this.stopWords.add("bettered");
        this.stopWords.add("betters");
        this.stopWords.add("better");
        this.stopWords.add("bettering");
        this.stopWords.add("betwixt");
        this.stopWords.add("between");
        this.stopWords.add("beneath");
        this.stopWords.add("been");
        this.stopWords.add("below");
        this.stopWords.add("besides");
        this.stopWords.add("beside");
        this.stopWords.add("m");
        this.stopWords.add("my");
        this.stopWords.add("myself");
        this.stopWords.add("mucher");
        this.stopWords.add("muchest");
        this.stopWords.add("much");
        this.stopWords.add("must");
        this.stopWords.add("musts");
        this.stopWords.add("musths");
        this.stopWords.add("musth");
        this.stopWords.add("main");
        this.stopWords.add("make");
        this.stopWords.add("mayest");
        this.stopWords.add("many");
        this.stopWords.add("mauger");
        this.stopWords.add("maugre");
        this.stopWords.add("me");
        this.stopWords.add("meanwhiles");
        this.stopWords.add("meanwhile");
        this.stopWords.add("mostly");
        this.stopWords.add("most");
        this.stopWords.add("moreover");
        this.stopWords.add("more");
        this.stopWords.add("might");
        this.stopWords.add("mights");
        this.stopWords.add("midst");
        this.stopWords.add("midsts");
        this.stopWords.add("h");
        this.stopWords.add("huh");
        this.stopWords.add("humph");
        this.stopWords.add("he");
        this.stopWords.add("hers");
        this.stopWords.add("herself");
        this.stopWords.add("her");
        this.stopWords.add("hereby");
        this.stopWords.add("herein");
        this.stopWords.add("hereafters");
        this.stopWords.add("hereafter");
        this.stopWords.add("hereupon");
        this.stopWords.add("hence");
        this.stopWords.add("hadst");
        this.stopWords.add("had");
        this.stopWords.add("having");
        this.stopWords.add("haves");
        this.stopWords.add("have");
        this.stopWords.add("has");
        this.stopWords.add("hast");
        this.stopWords.add("hardly");
        this.stopWords.add("hae");
        this.stopWords.add("hath");
        this.stopWords.add("him");
        this.stopWords.add("himself");
        this.stopWords.add("hither");
        this.stopWords.add("hitherest");
        this.stopWords.add("hitherer");
        this.stopWords.add("his");
        this.stopWords.add("how-do-you-do");
        this.stopWords.add("however");
        this.stopWords.add("how");
        this.stopWords.add("howbeit");
        this.stopWords.add("howdoyoudo");
        this.stopWords.add("hoos");
        this.stopWords.add("hoo");
        this.stopWords.add("w");
        this.stopWords.add("woulded");
        this.stopWords.add("woulding");
        this.stopWords.add("would");
        this.stopWords.add("woulds");
        this.stopWords.add("was");
        this.stopWords.add("wast");
        this.stopWords.add("we");
        this.stopWords.add("wert");
        this.stopWords.add("were");
        this.stopWords.add("with");
        this.stopWords.add("withal");
        this.stopWords.add("without");
        this.stopWords.add("within");
        this.stopWords.add("why");
        this.stopWords.add("what");
        this.stopWords.add("whatever");
        this.stopWords.add("whateverer");
        this.stopWords.add("whateverest");
        this.stopWords.add("whatsoeverer");
        this.stopWords.add("whatsoeverest");
        this.stopWords.add("whatsoever");
        this.stopWords.add("whence");
        this.stopWords.add("whencesoever");
        this.stopWords.add("whenever");
        this.stopWords.add("whensoever");
        this.stopWords.add("when");
        this.stopWords.add("whenas");
        this.stopWords.add("whether");
        this.stopWords.add("wheen");
        this.stopWords.add("whereto");
        this.stopWords.add("whereupon");
        this.stopWords.add("wherever");
        this.stopWords.add("whereon");
        this.stopWords.add("whereof");
        this.stopWords.add("where");
        this.stopWords.add("whereby");
        this.stopWords.add("wherewithal");
        this.stopWords.add("wherewith");
        this.stopWords.add("whereinto");
        this.stopWords.add("wherein");
        this.stopWords.add("whereafter");
        this.stopWords.add("whereas");
        this.stopWords.add("wheresoever");
        this.stopWords.add("wherefrom");
        this.stopWords.add("which");
        this.stopWords.add("whichever");
        this.stopWords.add("whichsoever");
        this.stopWords.add("whilst");
        this.stopWords.add("while");
        this.stopWords.add("whiles");
        this.stopWords.add("whithersoever");
        this.stopWords.add("whither");
        this.stopWords.add("whoever");
        this.stopWords.add("whosoever");
        this.stopWords.add("whoso");
        this.stopWords.add("whose");
        this.stopWords.add("whomever");
        this.stopWords.add("s");
        this.stopWords.add("syne");
        this.stopWords.add("syn");
        this.stopWords.add("shalling");
        this.stopWords.add("shall");
        this.stopWords.add("shalled");
        this.stopWords.add("shalls");
        this.stopWords.add("shoulding");
        this.stopWords.add("should");
        this.stopWords.add("shoulded");
        this.stopWords.add("shoulds");
        this.stopWords.add("she");
        this.stopWords.add("sayyid");
        this.stopWords.add("sayid");
        this.stopWords.add("said");
        this.stopWords.add("saider");
        this.stopWords.add("saidest");
        this.stopWords.add("same");
        this.stopWords.add("samest");
        this.stopWords.add("sames");
        this.stopWords.add("samer");
        this.stopWords.add("saved");
        this.stopWords.add("sans");
        this.stopWords.add("sanses");
        this.stopWords.add("sanserifs");
        this.stopWords.add("sanserif");
        this.stopWords.add("so");
        this.stopWords.add("soer");
        this.stopWords.add("soest");
        this.stopWords.add("sobeit");
        this.stopWords.add("someone");
        this.stopWords.add("somebody");
        this.stopWords.add("somehow");
        this.stopWords.add("some");
        this.stopWords.add("somewhere");
        this.stopWords.add("somewhat");
        this.stopWords.add("something");
        this.stopWords.add("sometimest");
        this.stopWords.add("sometimes");
        this.stopWords.add("sometimer");
        this.stopWords.add("sometime");
        this.stopWords.add("several");
        this.stopWords.add("severaler");
        this.stopWords.add("severalest");
        this.stopWords.add("serious");
        this.stopWords.add("seriousest");
        this.stopWords.add("seriouser");
        this.stopWords.add("senza");
        this.stopWords.add("send");
        this.stopWords.add("sent");
        this.stopWords.add("seem");
        this.stopWords.add("seems");
        this.stopWords.add("seemed");
        this.stopWords.add("seemingest");
        this.stopWords.add("seeminger");
        this.stopWords.add("seemings");
        this.stopWords.add("seven");
        this.stopWords.add("summat");
        this.stopWords.add("sups");
        this.stopWords.add("sup");
        this.stopWords.add("supping");
        this.stopWords.add("supped");
        this.stopWords.add("such");
        this.stopWords.add("since");
        this.stopWords.add("sine");
        this.stopWords.add("sines");
        this.stopWords.add("sith");
        this.stopWords.add("six");
        this.stopWords.add("stop");
        this.stopWords.add("stopped");
        this.stopWords.add("p");
        this.stopWords.add("plaintiff");
        this.stopWords.add("plenty");
        this.stopWords.add("plenties");
        this.stopWords.add("please");
        this.stopWords.add("pleased");
        this.stopWords.add("pleases");
        this.stopWords.add("per");
        this.stopWords.add("perhaps");
        this.stopWords.add("particulars");
        this.stopWords.add("particularly");
        this.stopWords.add("particular");
        this.stopWords.add("particularest");
        this.stopWords.add("particularer");
        this.stopWords.add("pro");
        this.stopWords.add("providing");
        this.stopWords.add("provides");
        this.stopWords.add("provided");
        this.stopWords.add("provide");
        this.stopWords.add("probably");
        this.stopWords.add("l");
        this.stopWords.add("layabout");
        this.stopWords.add("layabouts");
        this.stopWords.add("latter");
        this.stopWords.add("latterest");
        this.stopWords.add("latterer");
        this.stopWords.add("latterly");
        this.stopWords.add("latters");
        this.stopWords.add("lots");
        this.stopWords.add("lotting");
        this.stopWords.add("lotted");
        this.stopWords.add("lot");
        this.stopWords.add("lest");
        this.stopWords.add("less");
        this.stopWords.add("ie");
        this.stopWords.add("ifs");
        this.stopWords.add("if");
        this.stopWords.add("i");
        this.stopWords.add("info");
        this.stopWords.add("information");
        this.stopWords.add("itself");
        this.stopWords.add("its");
        this.stopWords.add("it");
        this.stopWords.add("is");
        this.stopWords.add("idem");
        this.stopWords.add("idemer");
        this.stopWords.add("idemest");
        this.stopWords.add("immediate");
        this.stopWords.add("immediately");
        this.stopWords.add("immediatest");
        this.stopWords.add("immediater");
        this.stopWords.add("in");
        this.stopWords.add("inwards");
        this.stopWords.add("inwardest");
        this.stopWords.add("inwarder");
        this.stopWords.add("inward");
        this.stopWords.add("inasmuch");
        this.stopWords.add("into");
        this.stopWords.add("instead");
        this.stopWords.add("insofar");
        this.stopWords.add("indicates");
        this.stopWords.add("indicated");
        this.stopWords.add("indicate");
        this.stopWords.add("indicating");
        this.stopWords.add("indeed");
        this.stopWords.add("inc");
        this.stopWords.add("f");
        this.stopWords.add("fact");
        this.stopWords.add("facts");
        this.stopWords.add("fs");
        this.stopWords.add("figupon");
        this.stopWords.add("figupons");
        this.stopWords.add("figuponing");
        this.stopWords.add("figuponed");
        this.stopWords.add("few");
        this.stopWords.add("fewer");
        this.stopWords.add("fewest");
        this.stopWords.add("frae");
        this.stopWords.add("from");
        this.stopWords.add("failing");
        this.stopWords.add("failings");
        this.stopWords.add("five");
        this.stopWords.add("furthers");
        this.stopWords.add("furtherer");
        this.stopWords.add("furthered");
        this.stopWords.add("furtherest");
        this.stopWords.add("further");
        this.stopWords.add("furthering");
        this.stopWords.add("furthermore");
        this.stopWords.add("fourscore");
        this.stopWords.add("followthrough");
        this.stopWords.add("for");
        this.stopWords.add("forwhy");
        this.stopWords.add("fornenst");
        this.stopWords.add("formerly");
        this.stopWords.add("former");
        this.stopWords.add("formerer");
        this.stopWords.add("formerest");
        this.stopWords.add("formers");
        this.stopWords.add("forbye");
        this.stopWords.add("forby");
        this.stopWords.add("fore");
        this.stopWords.add("forever");
        this.stopWords.add("forer");
        this.stopWords.add("fores");
        this.stopWords.add("four");
        this.stopWords.add("d");
        this.stopWords.add("ddays");
        this.stopWords.add("dday");
        this.stopWords.add("do");
        this.stopWords.add("doing");
        this.stopWords.add("doings");
        this.stopWords.add("doe");
        this.stopWords.add("does");
        this.stopWords.add("doth");
        this.stopWords.add("downwarder");
        this.stopWords.add("downwardest");
        this.stopWords.add("downward");
        this.stopWords.add("downwards");
        this.stopWords.add("downs");
        this.stopWords.add("done");
        this.stopWords.add("doner");
        this.stopWords.add("dones");
        this.stopWords.add("donest");
        this.stopWords.add("dos");
        this.stopWords.add("dost");
        this.stopWords.add("did");
        this.stopWords.add("differentest");
        this.stopWords.add("differenter");
        this.stopWords.add("different");
        this.stopWords.add("describing");
        this.stopWords.add("describe");
        this.stopWords.add("describes");
        this.stopWords.add("described");
        this.stopWords.add("despiting");
        this.stopWords.add("despites");
        this.stopWords.add("despited");
        this.stopWords.add("despite");
        this.stopWords.add("during");
        this.stopWords.add("c");
        this.stopWords.add("cum");
        this.stopWords.add("circa");
        this.stopWords.add("chez");
        this.stopWords.add("cer");
        this.stopWords.add("certain");
        this.stopWords.add("certainest");
        this.stopWords.add("certainer");
        this.stopWords.add("cest");
        this.stopWords.add("canst");
        this.stopWords.add("cannot");
        this.stopWords.add("cant");
        this.stopWords.add("cants");
        this.stopWords.add("canting");
        this.stopWords.add("cantest");
        this.stopWords.add("canted");
        this.stopWords.add("co");
        this.stopWords.add("could");
        this.stopWords.add("couldst");
        this.stopWords.add("comeon");
        this.stopWords.add("comeons");
        this.stopWords.add("come-ons");
        this.stopWords.add("come-on");
        this.stopWords.add("concerning");
        this.stopWords.add("concerninger");
        this.stopWords.add("concerningest");
        this.stopWords.add("consequently");
        this.stopWords.add("considering");
        this.stopWords.add("e");
        this.stopWords.add("eg");
        this.stopWords.add("eight");
        this.stopWords.add("either");
        this.stopWords.add("even");
        this.stopWords.add("evens");
        this.stopWords.add("evenser");
        this.stopWords.add("evensest");
        this.stopWords.add("evened");
        this.stopWords.add("evenest");
        this.stopWords.add("ever");
        this.stopWords.add("everyone");
        this.stopWords.add("everything");
        this.stopWords.add("everybody");
        this.stopWords.add("everywhere");
        this.stopWords.add("every");
        this.stopWords.add("ere");
        this.stopWords.add("each");
        this.stopWords.add("et");
        this.stopWords.add("etc");
        this.stopWords.add("elsewhere");
        this.stopWords.add("else");
        this.stopWords.add("ex");
        this.stopWords.add("excepted");
        this.stopWords.add("excepts");
        this.stopWords.add("except");
        this.stopWords.add("excepting");
        this.stopWords.add("exes");
        this.stopWords.add("enough");
    }
    
    public boolean isStopWord(String word) {
        return this.stopWords.contains(word);
    }
    
}
