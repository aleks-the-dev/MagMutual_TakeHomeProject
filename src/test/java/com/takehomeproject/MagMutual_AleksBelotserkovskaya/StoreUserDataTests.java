package com.takehomeproject.MagMutual_AleksBelotserkovskaya;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class StoreUserDataTests {
	
	String fileName = "src/main/java/com/takehomeproject/MagMutual_AleksBelotserkovskaya/UserInformation.csv";
	StoreUserData s = new StoreUserData();
	
	@Test
	public void testGetUsernameById() {
		s.storeUsers(fileName);
		String userOutput = s.getUsernameById("100");
		String expectedUserOutput = "Info for User 100 || First Name: Andree | Last Name: Flita | Email: Andree.Flita@gmail.com | Profession: worker | City: Nanjing | Country: Wallis and Futuna | Date User Was Created: 2020-08-31";
		Assert.isTrue(userOutput.equals(expectedUserOutput), "Testing getUsernameById().");
	}
	
	@Test
	public void testGetUsersByProfession() {
		s.storeUsers(fileName);
		String usersFromProfessions = s.getUsersByProfession("firefighter");
		String expectedUsersFromProfession = "Jere Hoban, Quintina Vivle, Jacenta Virgin, Belva Ephrem, Amara Macey, Libbie Ailyn, Joy Slifka, Paola Travax, Joy Orlene, Maurene Santoro, Marita Martsen, Farrah Erlandson, Albertina Brady, Elsie Pandolfi, Patricia Felecia, Jessamyn Dawkins, Fidelia Fleeta, Imojean Elbertina, Rivalee Joeann, Arlina Sikorski, Courtnay Goldina, Alleen Berne, Amii Helve, Tierney Carolin, Silvana Schenck, Marcy Orlene, Ulrike Kesley, Mady Percy, Sherrie Oster, Odessa Scammon, Ashlee Ellerey, Edith Killigrew, Valera Vary, Deane Capello, Gisela Christine, Cristabel Bohlin, Odessa Weinreb, Berget Adalbert, Hildegaard Lanita, Vanessa Donoghue, Bobbi Katrine, Gabi Raseda, Shannah Berard, Melina Ellord, Romona Anderea, Mahalia Jehu, Paule Ludewig, Nananne Elsinore, Harrietta Kermit, Netty Gillan, Gianina Demitria, Corene Selway, Janenna Boehike, Joy Ailyn, Joceline Parsaye, Tobe Zola, Kial Tannie, Meghann Gilmour, Eolanda Kamaria, Tori Redmond, Karly Juliet, Nyssa Herrera, Zaria O'Neill, Valera Carolin, Rosaline Bebe, Blinni Marsden, Gilda Tamsky, Dorice Fink, Bobinette Center, Elmira Hortensia, Eugine Anselmi, Wileen Soneson, Tobe Corilla, Jinny Pascia, Ileana Oscar, Rosene Fitzsimmons, Lauryn Flyn, Mellicent Tyson, Peri Xerxes, Donnie Shaddock, Melisent Azeria, Nollie Lalitta, Tonia Donoghue, Brianna Kirstin, Maridel Drus, Vinita Wenda, Mamie Georas, Merrie Viddah, Zia Munn, Tina Leler, Halette Giff, Elsie Bahr, Annecorinne Horan, Lanae Alwin, Fred Allina, Marinna Willie, Frank McNully, Ninnetta Peonir, Amalie Mott, Hyacinthe Lymann, Marline Ferrell, Mary Egbert, Oralee Carolin, Shaine Vittoria, Belva Dituri, Lynde Ochs, Concettina Connelly, Zia Elo, Meriel Skell, Celene Cherianne, Daune Tybald, Belva Fiann, Dyann Jacobah, Aaren Gordon, Halette Modie, Lulita Rese, Anthia Burnside, Brynna Stover, Kathy Tryck, Annaliese Sawtelle, Brana Anis, Gaylene Friede, Adele Arquit, Nollie Ingra, Genovera Libna, Shirlee Oscar, Lanae Nicoline, Wilma Izaak, Tierney Rugen, Carolina Stuart, Laure Brittani, Sue Bobbee, Aurelie Lesley, Deirdre Boycey, Benita Mehalek, Amara Peti, Gavrielle Thad, Renie Uird, Cherilyn Kare, Grier Melleta, Maryellen Gregrory, Dennie Giule, Lorie Orelee, Dorice Colyer, Dyann Joachim, Celisse Evvie, Daphne Mitzi, Devina Dowski, Tersina Kronfeld, Genevra Leopold, Silvana Lesley, Binny Wind, Sharai Calhoun, Nessie Ricki, Frieda Mandler, Alyda Zuzana, Dominga Garrison, Ida Lamoree, Lonnie Nance, Jan Fleeta, Sandie Alabaster, Dione Genna, Caressa Hedve, Priscilla Oster, Micheline Tarrant, Renae Gunn, Britni Pernick, Jacenta Norvol, Madalyn Madox, Ardeen Katrine, Ricky Dermott, Dawn Ries, Emmey Urias, Darlleen Trey, Charlena Ophelia, Darlleen Dawkins, Anestassia Thornburg, Bobinette Chobot, Mellicent Leary, Dawn Percy, Eadie Lasley, Ronna Peg, Philis Isidore, Cacilie Paine, Jessy Naashom, Flo Mata, Dulcinea Arne, Kamilah Seagraves, Mallory Karna, Susette Faust, Lexine Hebner, Belinda Winthorpe, Libbie Pulsifer, Jerry Terencio, Carol-Jean Ariella, Ada Jorgan, Adele Avi, Shandie Fax, Rosabelle Kirbee, Carmela Maroney, Dania Kat, Nikki Faust, Feliza Cloris";
		Assert.isTrue(usersFromProfessions.equals(expectedUsersFromProfession), "Testing getUsersByProfession().");
	}
	
	@Test
	public void testGetUsersByCountry() {
		s.storeUsers(fileName);
		String usersFromCountry = s.getUsersByCountry("Gambia");
		String expectedUsersFromCountry = "Shannah Publia, Hayley Hazlett";
		Assert.isTrue(usersFromCountry.equals(expectedUsersFromCountry), "Testing getUsersByCountry().");
	}
	
	@Test
	public void testGetUsersByDateRange() {
		s.storeUsers(fileName);
		String usersByDateRange = s.getUsersByDateRange("2022-01-08", "2022-01-09");
		String expectedUsersByDateRange = "Amara Macey, Devina Dowski, Leanna Stephie";
		Assert.isTrue(usersByDateRange.equals(expectedUsersByDateRange), "Testing getUsersByDateRange().");
	}

}