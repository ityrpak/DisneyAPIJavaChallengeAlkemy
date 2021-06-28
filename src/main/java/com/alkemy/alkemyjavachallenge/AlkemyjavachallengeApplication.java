package com.alkemy.alkemyjavachallenge;

import com.alkemy.alkemyjavachallenge.disneydb.models.DisneyCharacter;
import com.alkemy.alkemyjavachallenge.disneydb.models.Genre;
import com.alkemy.alkemyjavachallenge.disneydb.models.MovieOrShow;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.DisneyCharacterRepository;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.GenreRepository;
import com.alkemy.alkemyjavachallenge.disneydb.repositories.MovieOrShowRepository;
import com.alkemy.alkemyjavachallenge.disneydb.services.MovieOrShowServices;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@SpringBootApplication
public class AlkemyjavachallengeApplication implements CommandLineRunner {

	@Autowired
	private DisneyCharacterRepository disneyCharacterRepository;

	@Autowired
	private MovieOrShowRepository movieOrShowServices;

	@Autowired
	private GenreRepository genreServices;


	public static void main(String[] args) {
		SpringApplication.run(AlkemyjavachallengeApplication.class, args);

	}

	@Override
	public void run(String... args){

		// Building Character Table
		List<DisneyCharacter> characterList = new ArrayList<>();
		characterList.add(new DisneyCharacter(
				"Snow White",
				"https://static.wikia.nocookie.net/disney/images/3/33/Profile_-_Snow_White.jpeg/revision/latest/scale-to-width-down/516?cb=20200916135241",
				23,
				58,
				"Snow White is the titular protagonist of Disney's first animated feature-length film, Snow White and the Seven Dwarfs. She is a young princess; the 'Fairest One of All', whose beauty is defined by her inherent kindness and purity."
		));
		characterList.add(new DisneyCharacter(
				"The Evil Queen",
				"https://static.wikia.nocookie.net/disney/images/8/89/Profile_-_The_Evil_Queen.jpeg/revision/latest/scale-to-width-down/516?cb=20190312020700",
				35,
				60,
				"The Evil Queen (also known as the Wicked Queen, or simply, the Queen) is the main antagonist of Disney's 1937 animated feature film, Snow White and the Seven Dwarfs, and the first Disney villain in the Disney animated features canon. Determined to remain the fairest one of all, the Queen becomes insanely jealous of Snow White, the only one whose beauty surpasses her own."
		));
		characterList.add(new DisneyCharacter(
				"The Prince",
				"https://static.wikia.nocookie.net/disney/images/4/43/Profile_-_The_Prince.png/revision/latest/scale-to-width-down/515?cb=20190312150050",
				28,
				72,
				"The Prince is the romantic interest of the titular character in Disney's 1937 animated feature film, Snow White and the Seven Dwarfs."
		));
		characterList.add(new DisneyCharacter(
				"Doc",
				"https://static.wikia.nocookie.net/disney/images/1/17/Profile_-_Doc.png/revision/latest/scale-to-width-down/516?cb=20190312085018",
				78,
				60,
				"Doc is the leader of the seven dwarfs in Disney's 1937 animated film, Snow White and the Seven Dwarfs. Though he may seem befuddled due to his dithering speech pattern, Doc is an intelligent and reliable figurehead to whom the other dwarfs look for guidance."
		));
		characterList.add(new DisneyCharacter(
				"Grumpy",
				"https://static.wikia.nocookie.net/disney/images/e/ef/Profile_-_Grumpy.png/revision/latest/scale-to-width-down/516?cb=20201119224811",
				75,
				58,
				"Grumpy is one of the titular seven dwarfs in Disney's 1937 film Snow White and the Seven Dwarfs. True to his name, Grumpy is grouchy, overbearing, and short-fused. Often portrayed with a scowl and crossed arms, he is frequently annoyed by the other dwarfs. Deep down, Grumpy possesses a warm heart but seldom chooses to show it."
		));
		characterList.add(new DisneyCharacter(
				"Sleepy",
				"https://static.wikia.nocookie.net/disney/images/8/84/Profile_-_Sleepy.png/revision/latest/scale-to-width-down/516?cb=20190312085437",
				72,
				63,
				"Sleepy is one of the seven dwarfs in Disney's 1937 animated feature film, Snow White and the Seven Dwarfs. Sleepy gets his name from his perpetual drowsiness. He is typically less concerned about what's going on around him, and more so on taking a nap."
		));
		characterList.add(new DisneyCharacter(
				"Dopey",
				"https://static.wikia.nocookie.net/disney/images/f/f7/Profile_-_Dopey.png/revision/latest/scale-to-width-down/516?cb=20190312121425",
				59,
				62,
				"Dopey is the youngest of the seven dwarfs in Disney's 1937 animated film, Snow White and the Seven Dwarfs. He gets his name from his incompetence and penchant for silly antics. Dopey is the only dwarf who doesn't speak, and instead communicates through pantomime."
		));
		characterList.add(new DisneyCharacter(
				"Happy",
				"https://static.wikia.nocookie.net/disney/images/6/6b/Profile_-_Happy.png/revision/latest/scale-to-width-down/516?cb=20190312121331",
				67,
				63,
				"Happy is one of the seven dwarfs in Disney's 1937 film Snow White and the Seven Dwarfs. Happy gets his name from his jovial and optimistic demeanor. Most often seen with a cheery smile, he is partial to parties, food, and dancing—all of which he is eager to share with the other dwarfs."
		));
		characterList.add(new DisneyCharacter(
				"Bashful",
				"https://static.wikia.nocookie.net/disney/images/5/52/Profile_-_Bashful.png/revision/latest/scale-to-width-down/516?cb=20190312085147",
				65,
				64,
				"Bashful is one of the seven dwarfs in Disney's 1937 animated feature film Snow White and the Seven Dwarfs. The romantic of the group, Bashful is coy and self-conscious. He is prone to blushing and hiding behind his beard when feeling embarrassed."
		));
		characterList.add(new DisneyCharacter(
				"Sneezy",
				"https://static.wikia.nocookie.net/disney/images/7/7e/Profile_-_Sneezy.png/revision/latest/scale-to-width-down/516?cb=20190312085314",
				62,
				68,
				"Sneezy is one of the seven dwarfs in Disney's 1937 animated film Snow White and the Seven Dwarfs. As a result of severe hay fever or cold seasons, Sneezy is prone to eruptive, unpredictable, and uncontrollable bouts of sneezing, hence his name. He also speaks as if constantly suffering a stuffy nose"
		));
		characterList.add(new DisneyCharacter(
				"Huntsman",
				"https://static.wikia.nocookie.net/disney/images/e/e2/Humbert.jpg/revision/latest/scale-to-width-down/516?cb=20130314154607",
				45,
				80,
				"The Huntsman (named Humbert in some publicity materials) is a servant of the Queen and a minor character in Disney's 1937 animated feature film, Snow White and the Seven Dwarfs."
		));
		characterList.add(new DisneyCharacter(
				"Magic Mirror",
				"https://static.wikia.nocookie.net/disney/images/f/f9/Snowwhite-disneyscreencaps.com-100.jpg/revision/latest/scale-to-width-down/516?cb=20201125093643",
				1000,
				5,
				"The Magic Mirror is a powerful object first featured in Disney's 1937 film Snow White and the Seven Dwarfs. Within it dwells its slave, an imprisoned spirit (resembling a theatrical mask, surrounded by smoke and fire) who always speaks the truth, normally in verse form. The Evil Queen holds ownership of the mirror, and primarily exploits its power to ensure that she remains the fairest in the land."
		));
		characterList.add(new DisneyCharacter(
				"Simba",
				"https://static.wikia.nocookie.net/disney/images/3/37/Profile_-_Simba.jpeg/revision/latest/scale-to-width-down/516?cb=20190312043852",
				15,
				145,
				"Simba is the protagonist of Disney's 1994 animated feature film, The Lion King. He is the son of Mufasa and Sarabi, who was destined to rule the Pride Lands, as king. When Mufasa was murdered by his treacherous brother, Scar, Simba was exiled from the Pride Lands after his uncle blamed him for his father's death. He finds refuge in a jungle oasis with Timon and Pumbaa, but when the Pride Lands fall to disarray during his absence. With the kingdom in peril, Simba is forced to confront his troubled past and take his place in the 'Circle of Life'."
		));
		characterList.add(new DisneyCharacter(
				"Nala",
				"https://static.wikia.nocookie.net/disney/images/5/55/Profile_-_Nala.jpeg/revision/latest/scale-to-width-down/516?cb=20190312044211",
				14,
				129,
				"Nala is the deuteragonist of Disney's 1994 animated feature film, The Lion King. She is the lifelong best friend of Simba, prince of the Pride Lands. When the kingdom is taken over by Scar and his hyena henchmen, Nala rebels against their reign by assisting Simba in reclaiming the throne. She later becomes Simba's wife and the mother of two cubs: Kiara and Kion."
		));
		characterList.add(new DisneyCharacter(
				"Scar",
				"https://static.wikia.nocookie.net/disney/images/6/66/Profile_-_Scar.jpeg/revision/latest/scale-to-width-down/516?cb=20190312021344",
				22,
				129,
				"Scar is the main antagonist of Disney's 1994 animated feature film, The Lion King. As the brother of Mufasa and second-born prince of the Pride Lands, Scar was next in line to assume the throne as king. However, his chances were lost at the birth of his nephew, Simba. This embittered Scar with jealousy and a sense of entitlement, prompting him to develop a regicidal plot to take over the kingdom, with the aid of his hyena henchmen."
		));
		characterList.add(new DisneyCharacter(
				"Mufasa",
				"https://static.wikia.nocookie.net/disney/images/5/5e/Mufasa_Lion_King_.jpg/revision/latest/scale-to-width-down/516?cb=20180913082349",
				23,
				153,
				"Mufasa is a major character in Disney's 1994 animated feature film, The Lion King. He was the king of the Pride Lands and the father of Simba. In the midst of his reign, Mufasa was killed by his envious brother, Scar, in an effort to steal the throne. Despite his death, Mufasa endures in the memories of his loved ones. His spirit manifests in clouds, stars, and sunlight, which has occasionally appeared to guide his descendants. Even his grandson Kion he guided him through his mishaps and trained him with his Roar of the Elders."
		));
		characterList.add(new DisneyCharacter(
				"Timon",
				"https://static.wikia.nocookie.net/disney/images/4/45/Profile_-_Timon.jpeg/revision/latest/scale-to-width-down/516?cb=20190627010242",
				10,
				15,
				"Timon is a major character in Disney's 1994 animated feature film The Lion King and the protagonist of the 2004 film The Lion King 1½. He is a wisecracking meerkat and the best friend of Pumbaa. Though he originates from an industrious family, Timon lives an easygoing lifestyle of grub-eating and sleeping, under a 'problem-free philosophy' called Hakuna Matata"
		));
		characterList.add(new DisneyCharacter(
				"Pumbaa",
				"https://static.wikia.nocookie.net/disney/images/e/e6/Profile_-_Pumbaa.jpeg/revision/latest/scale-to-width-down/516?cb=20190312043302",
				12,
				140,
				"Pumbaa is a major character in Disney's 1994 animated feature film The Lion King and the deuteragonist of the 2004 film The Lion King 1½. He is a gluttonous warthog and the best friend of Timon. Most animals are wary and dismissive of Pumbaa due to his pungent odor, but he remains happy-go-lucky by following a philosophy called Hakuna Matata."
		));
		characterList.add(new DisneyCharacter(
				"Zazu",
				"https://static.wikia.nocookie.net/disney/images/9/95/Profile_-_Zazu.jpeg/revision/latest/scale-to-width-down/516?cb=20190312043508",
				5,
				1,
				"Zazu is a major character in Disney's 1994 animated feature film, The Lion King. He is an uptight, red-billed hornbill that served as majordomo and royal advisor to the Pride Lands monarchy. Zazu is charged with upholding order within the kingdom, though he is rarely taken seriously due to his diminutive size and fragile temper."
		));
		characterList.add(new DisneyCharacter(
				"Rafiki",
				"https://static.wikia.nocookie.net/disney/images/3/32/Profile_-_Rafiki.jpeg/revision/latest/scale-to-width-down/516?cb=20190314055144",
				10,
				50,
				"Rafiki is a supporting character in Disney's 1994 animated feature film The Lion King. He is a mandrill who serves as a shaman and Royal Mjuzi of the Pride Lands. Rafiki has an eccentricity that paints him as something of a lunatic; in truth, he is a sage with a deep connection to magical and spiritual elements."
		));
		characterList.add(new DisneyCharacter(
				"Sarabi",
				"https://static.wikia.nocookie.net/disney/images/2/2f/Sarabi.jpg/revision/latest/scale-to-width-down/515?cb=20160621214011",
				20,
				130,
				"Sarabi is a lioness who used to be the queen of the Pride Lands in Disney's 1994 animated feature film, The Lion King. She was Mufasa's wife (later widow) and is Simba's mother."
		));
		characterList.add(new DisneyCharacter(
				"Milo Thatch",
				"https://static.wikia.nocookie.net/disney/images/4/40/Profile_-_Milo_Thatch.png/revision/latest/scale-to-width-down/350?cb=20190401182656",
				27,
				59,
				"Milo James Thatch is the protagonist of Disney's 2001 animated feature film, Atlantis: The Lost Empire and its 2003 direct-to-video sequel. He serves as a linguist and cartography expert who directs the expedition to find the lost continent of Atlantis."
		));
		characterList.add(new DisneyCharacter(
				"Kida Nedakh",
				"https://static.wikia.nocookie.net/disney/images/3/34/Profile_-_Kida_Nedakh.jpeg/revision/latest/scale-to-width-down/516?cb=20200506165506",
				2000,
				57,
				"Kidagakash 'Kida' Nedakh is the deuteragonist of Disney's 2001 animated feature film Atlantis: The Lost Empire and its 2003 direct-to-video sequel. She is the daughter of Kashekim Nedakh, King of Atlantis."
		));
		characterList.add(new DisneyCharacter(
				"Lyle Tiberius Rourke",
				"https://static.wikia.nocookie.net/disney/images/c/c5/Profile_-_Lyle_Tiberius_Rourke.png/revision/latest/scale-to-width-down/515?cb=20190401184016",
				51,
				75,
				"Commander Lyle Tiberius Rourke is the main antagonist of Disney's 2001 animated feature film, Atlantis: The Lost Empire. Prior to the main events of the film, he was the Commander of a previous mission to Iceland where he assisted Milo Thatch's grandfather, Thaddeus, in locating the Shepherd's Journal. He initially appears as a very reliable and praiseworthy commander able to lead his men through perils, but as the film progresses, he turns out to be a highly manipulative, ruthless and sadistic mercenary who is out to capture the Heart of Atlantis and make money off of it."
		));
		characterList.add(new DisneyCharacter(
				"Helga Sinclair",
				"https://static.wikia.nocookie.net/disney/images/2/2e/Fullscreen_capture_462013_11712_PM.bmp.jpg/revision/latest/scale-to-width-down/350?cb=20130406173323",
				31,
				58,
				"Lieutenant Helga Katrina Sinclair is the secondary antagonist of Disney's 2001 animated feature film, Atlantis: The Lost Empire. She serves as second-in-command of the expedition to find the lost continent of Atlantis and additionally serves as the personal assistant to Preston Whitmore."
		));
		characterList.add(new DisneyCharacter(
				"Helga Sinclair",
				"https://static.wikia.nocookie.net/disney/images/2/2e/Fullscreen_capture_462013_11712_PM.bmp.jpg/revision/latest/scale-to-width-down/350?cb=20130406173323",
				31,
				58,
				"Lieutenant Helga Katrina Sinclair is the secondary antagonist of Disney's 2001 animated feature film, Atlantis: The Lost Empire. She serves as second-in-command of the expedition to find the lost continent of Atlantis and additionally serves as the personal assistant to Preston Whitmore."
		));
		characterList.add(new DisneyCharacter(
				"Gaetan Moliere",
				"https://static.wikia.nocookie.net/disney/images/c/c4/Atlantis354.jpg/revision/latest/scale-to-width-down/516?cb=20120409204630",
				50,
				106,
				"Gaetan 'Mole' Moliere is a supporting character in Atlantis: The Lost Empire who serves as mineralogist and excavations expert of the expedition to find the lost continent of Atlantis."
		));
		characterList.add(new DisneyCharacter(
				"Preston B. Whitmore",
				"https://static.wikia.nocookie.net/disney/images/1/1a/Atlantis877.jpg/revision/latest/scale-to-width-down/516?cb=20100306215036",
				62,
				72,
				"Preston B. Whitmore is a major character in the 2001 animated feature film Atlantis: The Lost Empire. An old friend of Milo's grandfather, he is a private millionaire who finances the expedition to find the lost continent of Atlantis."
		));
		characterList.add(new DisneyCharacter(
				"Joshua Sweet",
				"https://static.wikia.nocookie.net/disney/images/5/56/Profile_-_Joshua_Sweet.png/revision/latest/scale-to-width-down/516?cb=20190402181623",
				42,
				98,
				"Dr. Joshua Strongbear Sweet is a doctor who appears in Atlantis: The Lost Empire."
		));
		characterList.add(new DisneyCharacter(
				"Kashekim Nedakh",
				"https://static.wikia.nocookie.net/disney/images/2/2b/King_of_Atlantis.jpg/revision/latest/scale-to-width-down/350?cb=20130521163534",
				4000,
				60,
				"Kashekim Nedakh is a character in Atlantis: The Lost Empire who is the King and ruler of the lost continent of Atlantis, and the father of Princess Kidagakash Nedakh."
		));
		characterList.add(new DisneyCharacter(
				"Vincenzo Santorini",
				"https://static.wikia.nocookie.net/disney/images/1/1f/Profile_-_Vincenzo_Santorini.png/revision/latest/scale-to-width-down/516?cb=20190401182919",
				42,
				79,
				"Vincenzo 'Vinny' Santorini is a supporting character from Atlantis: The Lost Empire. He is an Italian explosives technician who serves as demolition expert of the expedition to find the lost continent of Atlantis. He would reappear in the direct-to-video sequel Atlantis: Milo's Return."
		));
		characterList.add(new DisneyCharacter(
				"Audrey Ramirez",
				"https://static.wikia.nocookie.net/disney/images/6/66/Profile_-_Audrey.png/revision/latest/scale-to-width-down/516?cb=20190401182757",
				17,
				58,
				"Audrey Rocio Ramirez is a tough, resourceful engineer and one of the main protagonists from Disney's 2001 animated feature film, Atlantis: The Lost Empire."
		));
		characterList.add(new DisneyCharacter(
				"Wilhelmina Packard",
				"https://static.wikia.nocookie.net/disney/images/2/27/Atlantis166.jpg/revision/latest/scale-to-width-down/516?cb=20101203165134",
				62,
				70,
				"Wilhelmina Bertha Packard is a supporting character from Disney's 2001 animated feature film, Atlantis: The Lost Empire. She is an elderly, sarcastic, chain-smoking radio operator."
		));
		characterList.add(new DisneyCharacter(
				"Jack Sparrow",
				"https://static.wikia.nocookie.net/disney/images/2/28/Profile_-_Jack_Sparrow.png/revision/latest/scale-to-width-down/320?cb=20190814020525",
				32,
				72,
				"Captain Jack Sparrow is the protagonist of the Pirates of the Caribbean film series, making his debut in Pirates of the Caribbean: The Curse of the Black Pearl. Drunken, charismatic, and morally gray, Jack is one of the most infamous pirates to ever sail the Seven Seas, known as the rightful commander of the Black Pearl."
		));
		characterList.add(new DisneyCharacter(
				"Hector Barbossa",
				"https://static.wikia.nocookie.net/disney/images/e/e2/Barbossa_thinks.jpg/revision/latest/scale-to-width-down/516?cb=20190815121013",
				62,
				74,
				"Captain Hector Barbossa is a major character in the Pirates of the Caribbean film series, first appearing as the main antagonist of the first film The Curse of the Black Pearl. He is a notorious pirate captain that spent the better half of his life as the arch-rival of Captain Jack Sparrow. From commanding the Black Pearl to becoming the Pirate Lord of the Caspian Sea, Barbossa led a prosperous life, which eventually bookended in a heroic sacrifice to save his daughter, Carina Smyth."
		));
		characterList.add(new DisneyCharacter(
				"Will Turner",
				"https://static.wikia.nocookie.net/disney/images/f/fd/Will_Turner_curseless.jpg/revision/latest/scale-to-width-down/516?cb=20190815122353",
				32,
				75,
				"Living on Port Royal since childhood after being rescued by Elizabeth Swann, Will established himself as a humble blacksmith, though he was burdened by his mysterious past and harbored romantic affections for Swann. His life would take a massive turn when Port Royal fell under a pirate attack, resulting in the kidnapping of Elizabeth. Turner channels his inner pirate and sets sail alongside the infamous Jack Sparrow to rescue his love, and in doing so, ushers in a new age of piracy that would ultimately result in Turner wedding Elizabeth, conceding a child, and becoming the new captain of the Flying Dutchman for ten years."
		));
		characterList.add(new DisneyCharacter(
				"Elizabeth Swann",
				"https://static.wikia.nocookie.net/disney/images/3/3d/DMTNT_Elizabeth_Swann_cropped.png/revision/latest/scale-to-width-down/516?cb=20190815121708",
				25,
				58,
				"Elizabeth Turner (née Swann) is the tritagonist of the Pirates of the Caribbean franchise. As a young girl, she found a mysterious shipwreck survivor named Will Turner. Little did she know what adventures would stem from this fateful encounter. With an adventurous spirit and the need to break the societal boundaries, she had long been fascinated with the freewheeling world of buccaneers to a point of learning a song about pirates as a child. Both Jack Sparrow and Will Turner change Elizabeth's notions of romance and adventure forever, soon learning that all the rules she believed in are meant to be broken. She later married Will Turner and conceived a child shortly before Will left to serve his ten years aboard the Flying Dutchman."
		));
		characterList.add(new DisneyCharacter(
				"James Norrington",
				"https://static.wikia.nocookie.net/disney/images/a/ab/Norrington.jpg/revision/latest/scale-to-width-down/516?cb=20151119192054",
				42,
				76,
				"Admiral James Norrington is a major character in the first three films of Disney's Pirates of the Caribbean film series."
		));
		characterList.add(new DisneyCharacter(
				"Weatherby Swann",
				"https://static.wikia.nocookie.net/disney/images/7/7e/Weatherby_Swann.jpg/revision/latest/scale-to-width-down/292?cb=20120325221446",
				67,
				86,
				"Governor Weatherby Swann is a major supporting character from the live-action Pirates of the Caribbean movies. He is portrayed by Jonathan Pryce."
		));
		characterList.add(new DisneyCharacter(
				"Peter Pevensie",
				"https://static.wikia.nocookie.net/disney/images/9/9a/Kingpeter.png/revision/latest/scale-to-width-down/240?cb=20120519144137",
				17,
				65,
				"Peter Pevensie is the eldest of the Pevensie children, and the ruler of the Kingdom of Narnia after the Queen Jadis the White Witch's demise. As the oldest, he is responsible and caring; he is also one of the bravest. His Narnian title is His Majesty King Peter, High King of Narnia, Emperor of the Lone Islands, Lord of Cair Paravel, Knight of the Most Noble Order of the Lion, as well as Sir Peter Wolf's-Bane, and Peter the Magnificent, High King over all the kings of Narnia."
		));
		characterList.add(new DisneyCharacter(
				"Susan Pevensie",
				"https://static.wikia.nocookie.net/disney/images/3/3e/Tumblr_m4pnvtqagj1r6r2aho3_250.png/revision/latest/scale-to-width-down/240?cb=20121021182637",
				16,
				50,
				"Susan Pevensie is the elder sister and the second eldest Pevensie child. She appears in as a child in The Lion, the Witch and the Wardrobe, Prince Caspian, and Voyage of the Dawn Treader, and as an adult in The Lion, the Witch and the Wardrobe. During her reign at the Narnian capital of Cair Paravel, she is known as Queen Susan the Gentle or Queen Susan of the Horn."
		));
		characterList.add(new DisneyCharacter(
				"Edmund Pevensie",
				"https://static.wikia.nocookie.net/disney/images/f/f2/Edmund.jpg/revision/latest/scale-to-width-down/264?cb=20110123170846",
				14,
				56,
				"Edmund Pevensie is a character in the Chronicles of Narnia film series. He is the third Pevensie child who appears in all three films in the Chronicles of Narnia series: The Lion, the Witch and the Wardrobe, Prince Caspian, and The Voyage of the Dawn Treader."
		));
		characterList.add(new DisneyCharacter(
				"Lucy Pevensie",
				"https://static.wikia.nocookie.net/disney/images/5/59/Queenlucysmall.png/revision/latest/scale-to-width-down/240?cb=20120515125129",
				12,
				45,
				"Lucy Pevensie is a character in the Chronicles of Narnia film series, based on C. S. Lewis's fantasy novel series of the same name. She is the youngest of the four Pevensie children and was the first one to discover Narnia through the wardrobe."
		));
		characterList.add(new DisneyCharacter(
				"Aslan",
				"https://static.wikia.nocookie.net/disney/images/1/17/Aslan2.jpg/revision/latest/scale-to-width-down/516?cb=20190425153721",
				10000,
				140,
				"Aslan is the Great Lion who is the tritagonist of the Chronicles of Narnia film series. He is the Primordial Creator and True King of Narnia, a parallel world full of magic, he created as a replica of his own home, known to the Narnians' as Aslan's Country; a mysterious and peaceful world similar to the afterlife, the spirit world or Heaven itself."
		));
		characterList.add(new DisneyCharacter(
				"Jadis the White Witch",
				"https://static.wikia.nocookie.net/disney/images/d/dd/691DE21C-19D3-472D-8ABC-37803C6DBE89-3175-000006011CA28898.jpg/revision/latest/scale-to-width-down/516?cb=20190315151028",
				4000,
				65,
				"Jadis the White Witch is the main antagonist from the 2005 Walt Disney Pictures feature film The Chronicles of Narnia: The Lion, the Witch and the Wardrobe, which is based on the popular children's book series by C.S. Lewis. She was portrayed by British actress Tilda Swinton. Swinton's performance won particular acclaim among fans and critics"
		));
		characterList.add(new DisneyCharacter(
				"Caspian X",
				"https://static.wikia.nocookie.net/disney/images/f/f7/PrinceCaspian.jpg/revision/latest/scale-to-width-down/334?cb=20100606201149",
				24,
				75,
				"In the books, Caspian served as King of Narnia, Lord of Cair Paravel, and Emperor of the Lone Islands, also called Caspian the Seafarer and Caspian the Navigator (2290 – 2356, Narnian Time) was one of the greatest leaders of the Narnian Empire who took part in the successful Narnian Revolution and began the Age of Exploration. Caspian was descended from the Telmarine Dynasty and was succeeded by his son Rilian. Caspian was fair like most of the Telmarines. He was said to resemble his father."
		));
		characterList.add(new DisneyCharacter(
				"Miraz",
				"https://static.wikia.nocookie.net/disney/images/c/cd/240px-Miraz-pcfilm.png/revision/latest/scale-to-width-down/240?cb=20090626020307",
				42,
				82,
				"King Miraz (reign: Narnian-years 2290—2303) was the main antagonist in Chronicles of Narnia: Prince Caspian and unrightful ruler of the Kingdom of Narnia, reigning during the revisit of the Pevensie children and the second conquest of Narnia, the conquerors being the Telmarines, who captured the anarchy-ridden land after the disappearance of the Pevensies."
		));
		characterList.add(new DisneyCharacter(
				"Anna",
				"https://static.wikia.nocookie.net/disney/images/0/0f/Profile_-_Anna.jpeg/revision/latest/scale-to-width-down/516?cb=20200319054431",
				19,
				50,
				"Queen Anna of Arendelle (pronounced Ah-na) is the protagonist of Disney's 2013 animated feature film Frozen and the deuteragonist of its 2019 sequel. She is the second-born daughter of King Agnarr and Queen Iduna, the younger sister of Elsa the Snow Queen, and the contemporary ruler of Arendelle. During their childhood, an accident involving Elsa's magic created a rift between the two sisters, leaving Anna devoid of love for many years. Despite this, Anna remained big-hearted and optimistic, albeit socially awkward. When their estrangement incidentally triggers an eternal winter, Anna embarks on a perilous journey to save her kingdom and mend the broken bond between herself and her sister."
		));
		characterList.add(new DisneyCharacter(
				"Elsa",
				"https://static.wikia.nocookie.net/disney/images/9/95/Profile_-_Elsa.jpeg/revision/latest/scale-to-width-down/516?cb=20200319054311",
				21,
				52,
				"Elsa the Snow Queen[2][3][4] is the deuteragonist of Disney's 2013 animated feature film Frozen and the protagonist of its 2019 sequel. Born with the power of ice and snow, Elsa is the firstborn daughter of King Agnarr and Queen Iduna, the older sister of Queen Anna, and the former queen of Arendelle. Throughout most of her young life, Elsa feared that her powers were monstrous. Therefore, she isolated herself from the world as a means of protecting her family and kingdom. Elsa's anxieties would eventually trigger a curse that plunged Arendelle into an eternal winter. Through Anna's love, however, Elsa was able to control her powers and live peacefully amongst her people with a newfound self-confidence."
		));
		characterList.add(new DisneyCharacter(
				"Kristoff",
				"https://static.wikia.nocookie.net/disney/images/b/b4/Profile_-_Kristoff.jpeg/revision/latest/scale-to-width-down/516?cb=20201122004647",
				24,
				65,
				"Kristoff Bjorgman[1] is the tritagonist of Disney's 2013 animated feature film Frozen and a major character in its 2019 sequel. He is a Sami[2] outdoorsman that worked as an ice harvester with his reindeer Sven. Having been an orphan[3][4] raised by a colony of trolls, Kristoff was initially wary of humans, believing them to be cheating crooks. His outlook would slowly change upon meeting Princess Anna, whose warmheartedness would prove that people aren't as bad as Kristoff believed."
		));
		characterList.add(new DisneyCharacter(
				"Sven",
				"https://static.wikia.nocookie.net/disney/images/0/0b/Profile_-_Sven.jpeg/revision/latest/scale-to-width-down/515?cb=20190312031834",
				20,
				105,
				"Sven is a major character in Disney's 2013 animated feature film Frozen and its 2019 sequel. He is Kristoff's reindeer and best friend. Being a deer, Sven does not talk, and instead communicates through grunt-like vocals. However, Kristoff occasionally voices Sven's thoughts using a goofy 'reindeer voice'."
		));
		characterList.add(new DisneyCharacter(
				"Olaf",
				"https://static.wikia.nocookie.net/disney/images/5/53/Profile_-_Olaf.jpeg/revision/latest/scale-to-width-down/516?cb=20200221075027",
				5,
				4,
				"Olaf is a major character in Disney's 2013 animated feature film Frozen and its 2019 sequel. He is a benevolent enchanted snowman created by Elsa. Along with the ability to reassemble his body, Olaf’s most prominent quirk is his love for summer and all things hot."
		));
		characterList.add(new DisneyCharacter(
				"Hans",
				"https://static.wikia.nocookie.net/disney/images/e/ee/Profile_-_Hans.jpeg/revision/latest/scale-to-width-down/516?cb=20190423110943",
				31,
				68,
				"Prince Hans of the Southern Isles is the main antagonist of Disney's 2013 animated feature film, Frozen. He is the youngest of thirteen sons, burdened with the inability to ascend his family's throne in the Southern Isles. Desperate for power and recognition, Hans plots to instead rule Arendelle as king through means of marriage and regicide."
		));
		characterList.add(new DisneyCharacter(
				"Judy Hopps",
				"https://static.wikia.nocookie.net/disney/images/d/da/Profile_-_Judy_Hopps.jpeg/revision/latest/scale-to-width-down/516?cb=20190415002656",
				9,
				7,
				"Officer Judy Hopps is the protagonist of Disney's 2016 animated feature film, Zootopia. The first rabbit officer of the Zootopia Police Department, Judy is determined to make the world a better place while breaking preconceptions about other species. Teaming up with a fox named Nick Wilde, she sets off on her first case but discovers a sinister conspiracy is at play."
		));
		characterList.add(new DisneyCharacter(
				"Nick Wilde",
				"https://static.wikia.nocookie.net/disney/images/5/50/Profile_-_Nick_Wilde.jpeg/revision/latest/scale-to-width-down/516?cb=20190312045634",
				10,
				8,
				"Nick Wilde is the deuteragonist of Disney's 2016 animated feature film, Zootopia. He is a con-artist fox in the city of Zootopia who finds himself compelled to aid Officer Judy Hopps, a rabbit, in her investigation. Despite their differences, Nick forms a friendship with Judy, who helps him realize he can be more than his stereotype. Nick makes good on this lesson by becoming a police officer and Judy's partner."
		));
		characterList.add(new DisneyCharacter(
				"Chief Bogo",
				"https://static.wikia.nocookie.net/disney/images/6/63/Profile_-_Chief_Bogo.jpeg/revision/latest/scale-to-width-down/516?cb=20190312050735",
				14,
				86,
				"Chief Bogo is a major character in Disney's 2016 animated feature film, Zootopia. He is a cape buffalo and the chief of the Zootopia Police Department. Stern and critical, Bogo was fiercely against the inclusion of Judy Hopps as the ZPD's first rabbit officer, due to a firm belief that smaller mammals were unfit for police work."
		));
		characterList.add(new DisneyCharacter(
				"Bellwether",
				"https://static.wikia.nocookie.net/disney/images/8/85/Profile_-_Bellwether_.jpeg/revision/latest/scale-to-width-down/516?cb=20190312051343",
				16,
				40,
				"Assistant Mayor Bellwether is the main antagonist of Disney's 2016 animated feature film Zootopia. A scorned sheep, her ultimate goal is to supplement the position held by Mayor Lionheart and create a new order where prey animals dominate the predators."
		));
		characterList.add(new DisneyCharacter(
				"Clawhauser",
				"https://static.wikia.nocookie.net/disney/images/7/7b/Profile_-_Clawhauser.jpeg/revision/latest/scale-to-width-down/515?cb=20190312050417",
				14,
				75,
				"Officer Clawhauser is a supporting character in Disney's 2016 animated feature film, Zootopia. He is an overweight cheetah that works for the Zootopia Police Department as a receptionist and a radio dispatcher. Clawhauser is Judy's first friend at ZPD."
		));
		characterList.add(new DisneyCharacter(
				"Rapunzel ",
				"https://static.wikia.nocookie.net/disney/images/a/ae/Profile_-_Rapunzel.jpeg/revision/latest/scale-to-width-down/516?cb=20190312015421",
				18,
				56,
				"Rapunzel is the protagonist of Disney's 2010 animated feature film, Tangled. She is the princess of the kingdom of Corona, known for her long, magical, golden hair. As a child, Rapunzel was abducted by a wicked crone and locked away in a remote tower for eighteen years—during which, she became fascinated with a phenomenon involving 'floating lights' that would only appear on her birthday. With the aid of the handsome thief, Flynn Rider, Rapunzel escaped her tower to learn more about the lights and pursue her dream of exploring the outside world."
		));
		characterList.add(new DisneyCharacter(
				"Flynn Rider",
				"https://static.wikia.nocookie.net/disney/images/8/84/Profile_-_Flynn_Rider.jpeg/revision/latest/scale-to-width-down/350?cb=20190312032147",
				22,
				72,
				"Eugene Fitzherbert (better known as Flynn Rider) is the deuteragonist of Disney's 2010 animated feature film, Tangled. A swashbuckler known for his charm and quick-wit, Flynn made a name for himself as a notorious thief. In a turn of events following years of travel and plunder, however, he experienced a change of heart upon falling in love with Rapunzel, the lost princess of Corona."
		));
		characterList.add(new DisneyCharacter(
				"Captain of the Guards",
				"https://static.wikia.nocookie.net/disney/images/5/56/Tangled_Captain.jpeg/revision/latest/scale-to-width-down/516?cb=20190213091614",
				34,
				85,
				"The Captain of the Guards is a supporting character in Disney's 2010 animated feature film, Tangled. He is the head of the Corona royal guard, tasked with protecting the kingdom from criminals and thieves. He is typically aided by his palace horse, Maximus"
		));
		characterList.add(new DisneyCharacter(
				"Vladimir",
				"https://static.wikia.nocookie.net/disney/images/4/49/Tangled_-_Vladimir.jpg/revision/latest/scale-to-width-down/516?cb=20171228072237",
				30,
				85,
				"Vladimir is a supporting character in Disney's 2010 animated feature film, Tangled. He is one of the strongest and most menacing of the Pub Thugs. His hobby includes collecting ceramic unicorns."
		));
		characterList.add(new DisneyCharacter(
				"Shorty",
				"https://static.wikia.nocookie.net/disney/images/3/35/Shorty.jpg/revision/latest/scale-to-width-down/516?cb=20170809061445",
				62,
				53,
				"Shorty is a supporting character in Disney's 2010 animated feature film, Tangled. He's the oldest and possibly craziest member of the Pub Thugs."
		));
		characterList.add(new DisneyCharacter(
				"Big Nose",
				"https://static.wikia.nocookie.net/disney/images/0/05/BigNose.jpg/revision/latest/scale-to-width-down/516?cb=20140207001129",
				28,
				76,
				"Big Nose is a supporting character in Disney's 2010 animated feature film, Tangled. He is the most 'beautiful' of all the Pub Thugs. He is a hopeless romantic, with the tendency to be constantly abused by Hook Hand. His dream is to find love in someone who can see his inner beauty."
		));
		characterList.add(new DisneyCharacter(
				"Mother Gothel",
				"https://static.wikia.nocookie.net/disney/images/f/f9/Profile_-_Mother_Gothel.jpeg/revision/latest/scale-to-width-down/516?cb=20190312065459",
				28,
				60,
				"Mother Gothel is the main antagonist of Disney's 2010 animated feature film, Tangled. She is a wicked crone who retained youth for hundreds of years through the healing properties of a magic, golden flower. When the flower's powers are transferred to the hair of Rapunzel, Gothel kidnapped the princess and locked her away in a secluded tower, where she hoarded Rapunzel's healing magic. To keep the princess under her control, Gothel made lies about the world being evil."
		));
		disneyCharacterRepository.saveAll(characterList);
		System.out.println("Disney Characters Loaded");
		// Finished Building Character Table

		// Building Movie Table
		List<MovieOrShow> movieList = new ArrayList<>();
		MovieOrShow e = new MovieOrShow(
				"Snow White and the Seven Dwarfs",
				"https://static.wikia.nocookie.net/disney/images/4/45/Snow_White_Poster.jpg/revision/latest/scale-to-width-down/516?cb=20190822153655",
				LocalDate.of(1937, 12,21),
				3.9
		);
		movieList.add(e);
		movieList.add(new MovieOrShow(
				"The Lion King",
				"https://static.wikia.nocookie.net/disney/images/6/63/The_lion_king_poster.jpg/revision/latest/scale-to-width-down/515?cb=20140316165348",
				LocalDate.of(1994,06,24),
				4.2
		));
		movieList.add(new MovieOrShow(
				"Atlantis: The Lost Empire",
				"https://static.wikia.nocookie.net/disney/images/d/de/Atlantis_The_Lost_Empire_poster.jpg/revision/latest/scale-to-width-down/515?cb=20160617163532",
				LocalDate.of(2001,06,15),
				4.5
		));
		movieList.add(new MovieOrShow(
				"Pirates of the Caribbean: The Curse of the Black Pearl",
				"https://static.wikia.nocookie.net/disney/images/0/0e/Pirates_of_the_Caribbean_movie.jpg/revision/latest/scale-to-width-down/516?cb=20160619155135",
				LocalDate.of(2003,07,9),
				3.8
		));
		movieList.add(new MovieOrShow(
				"Pirates of the Caribbean: Dead's Man Chest",
				"https://static.wikia.nocookie.net/disney/images/9/93/Dead_man%27s_chest.jpg/revision/latest/scale-to-width-down/515?cb=20140317170043",
				LocalDate.of(2006,07,7),
				3.9
		));
		movieList.add(new MovieOrShow(
				"The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
				"https://static.wikia.nocookie.net/disney/images/f/fd/Chronicles_of_narnia_the_lion_the_witch_and_the_wardrobe.jpg/revision/latest/scale-to-width-down/515?cb=20140317235438",
				LocalDate.of(2005,12,9),
				3.6
		));
		movieList.add(new MovieOrShow(
				"The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
				"https://static.wikia.nocookie.net/disney/images/5/59/PrinceCaspianposter.jpg/revision/latest/scale-to-width-down/516?cb=20140317235602",
				LocalDate.of(2008,5,16),
				3.5
		));
		movieList.add(new MovieOrShow(
				"Frozen",
				"https://static.wikia.nocookie.net/disney/images/5/58/Frozen-movie-poster.jpg/revision/latest/scale-to-width-down/516?cb=20160606223222",
				LocalDate.of(2013,11,19),
				3.8
		));
		movieList.add(new MovieOrShow(
				"Zootopia",
				"https://static.wikia.nocookie.net/disney/images/2/2f/Zootopia_Poster.jpg/revision/latest/scale-to-width-down/515?cb=20160615162624",
				LocalDate.of(2016,3,4),
				3.7
		));
		movieList.add(new MovieOrShow(
				"Tangled",
				"https://static.wikia.nocookie.net/disney/images/2/2f/Tangled_poster_nov-535x745.jpg/revision/latest/scale-to-width-down/516?cb=20140317004447",
				LocalDate.of(2010,11,24),
				3.5
		));
		movieOrShowServices.saveAll(movieList);
		System.out.println("Movies and Shows Loaded");
		// Finished Building Movie Table


		// Building Genre Table
		List<Genre> genreList = new ArrayList<>();
		genreList.add(new Genre(
				"Animation",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Animation_icon-icons.com_74659.png"
		));
		genreList.add(new Genre(
				"Family",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Family_icon-icons.com_74665.png"
		));
		genreList.add(new Genre(
				"Fantasy",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Fantasy_icon-icons.com_74666.png"
		));
		genreList.add(new Genre(
				"Drama",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Drama_icon-icons.com_74664.png"
		));
		genreList.add(new Genre(
				"Action",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Action_icon-icons.com_74657.png"
		));
		genreList.add(new Genre(
				"Adventure",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Adventure_icon-icons.com_74658.png"
		));
		genreList.add(new Genre(
				"Comedy",
				"https://cdn.icon-icons.com/icons2/965/PNG/512/Comedy_icon-icons.com_74661.png"
		));
		genreServices.saveAll(genreList);
		System.out.println("Genres Loaded");
		// Finished Building Genre Table

	}

}
