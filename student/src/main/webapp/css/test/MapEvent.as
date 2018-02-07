package 
{
	import flash.events.*;
	
	public class MapEvent extends Event
	{
		public var value:String;
		public static const SELECT:String = "select" ;
		
		public function MapEvent(value:String=null)
		{
			if(value!=null) this.value = value ;
			super(SELECT,false,false);
		}
		
	}
}