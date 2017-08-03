package info.is2005.stoneyintegration;

public final class Constants
{
	private Constants(){}
	
	public static final class ModIDs
	{
		private ModIDs(){}
		
		public static final String AppliedEnergistics2 = "appliedenergistics2";
		public static final String EnderIO = "EnderIO";
		public static final String Harvestcraft = "harvestcraft";
		public static final String Natura = "Natura";
	}
	
	public static final class Items
	{
		private Items(){}
		
		public static final class AppliedEnergistics2
		{
			private AppliedEnergistics2(){}
			
			public static String FlourName = "item.ItemMultiMaterial";
			public static byte FlourMD = 4;
		}
		
		public static final class EnderIO
		{
			private EnderIO(){}
			
			public static String FlourName = "itemPowderIngot";
			public static byte FlourMD = 8;
		}
		
		public static final class Harvestcraft
		{
			private Harvestcraft(){}
			
			public static String FlourName = "flourItem";
		}
		
		public static final class Natura
		{
			private Natura(){}
			
			public static String FlourName = "barleyFlour";
			public static String BarleyName = "barleyFood";
			public static byte WheatFlourMD = 1;
			public static byte BarleyFlourMD = 2;
		}
	}
}
