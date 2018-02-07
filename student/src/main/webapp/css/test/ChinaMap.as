package
{
	import flash.display.*;
	import flash.events.*;
	import flash.net.*;
	import flash.geom.Matrix;
	
	import com.greensock.*;
	
	public class ChinaMap extends Sprite
	{
		private var china:China;              // 地图轮廓、省界、省名文本等
		private var map:Map;                 //  地图-Sprite-感应鼠标
		private var backColor:Sprite;       //   地图颜色
		
		public var xml:XML;
		
		public function ChinaMap()
		{
			
			var urlLoader:URLLoader = new URLLoader();
			urlLoader.addEventListener(Event.COMPLETE,loaded);
			urlLoader.load(new URLRequest("data/data.xml"));
		}
		
		private function loaded(e:Event):void
		{
			e.target.removeEventListener(Event.COMPLETE,loaded);  
			
			xml = XML(e.target.data) ;
			dispatchEvent(new Event(Event.COMPLETE)) ;
			init();
		}
		
		private function init():void
		{
			china = new China();
			map = china.map ;
			backColor = china.mapBack ;
			
			var scale:Number = china.width/china.height ;
			china.width = stage.stageWidth ;
			china.height= china.width/scale - 8 ;
			addChild(china);
			
			var temp:MovieClip;
			for each(var area:XML in xml.area)
			{
				temp = map[area.@name] ;
				
				if(area.@mouseEnabled=="true")
				{
					temp.id = area.@id ;
					temp.buttonMode = true ;
					temp.alpha = 0 ;
				}
				else
				{
					temp.mouseEnabled = false;
					temp.alpha = 0.35 ;
				}
			}
			
			drawMapBack();
			map.addEventListener(MouseEvent.MOUSE_OVER,overHandler);
			map.addEventListener(MouseEvent.MOUSE_OUT,outHandler);
			map.addEventListener(MouseEvent.CLICK,clickHandler);
			
			//this.addEventListener(Event.SELECT,testEvent);  //侦听点击事件
		}
		
		private function testEvent(e:MapEvent):void
		{
			trace(e.value);
		}
		
		private function drawMapBack():void
		{
			var dat:XMLList = xml.settings ;
			var colors:Array = dat.child(0).toString().split(",");
			var type:String = dat.child(2);
			var len:int = colors.length ;
			var ratios:Array = [] ;
			var alphas:Array = [] ;
			var mat:Matrix = new Matrix();
			
			if(type!=GradientType.LINEAR&&type!=GradientType.RADIAL)
			type = GradientType.LINEAR ;
			
			for(var i:int;i<len;i++)
			{
				colors[i]=Number(colors[i]) ;
				ratios[i] = int(255*i/(len-1)) ;
				alphas[i] = 1 ;
			}
			//trace(colors,ratios,alphas);
			backColor.graphics.clear();
			mat.createGradientBox(755,640,xml.settings.child(1));
			backColor.graphics.beginGradientFill(type,colors,alphas,ratios,mat);
			backColor.graphics.drawRect(0,0,755,640);
			backColor.graphics.endFill();
			
		}
		
		private function overHandler(e:MouseEvent):void
		{
			if(e.target is MovieClip)
			{
				TweenLite.to(e.target,0.5,{alpha:1});
			}
			
		}
		
		private function outHandler(e:MouseEvent):void
		{
			if(e.target is MovieClip)
			TweenLite.to(e.target,0.5,{alpha:0});
		}
		
		private function clickHandler(e:MouseEvent):void
		{
			var mapEvent = new MapEvent();
			mapEvent.value = e.target.id ;
			
			if(e.target is MovieClip)
			{
				var url:String = xml.area.(@id==mapEvent.value).@url.toString() ;
				if(url!= "")
				navigateToURL (new URLRequest(url),"_blank") ;
				
				dispatchEvent(mapEvent) ;
			}
			
		}
		
		
	}
}