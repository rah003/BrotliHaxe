// Generated by Haxe 3.4.0
package encode.encode;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BrotliParams extends haxe.lang.HxObject
{
	public BrotliParams(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BrotliParams()
	{
		//line 36 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		encode.encode.BrotliParams.__hx_ctor_encode_encode_BrotliParams(this);
	}
	
	
	public static void __hx_ctor_encode_encode_BrotliParams(encode.encode.BrotliParams __hx_this)
	{
		//line 38 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.mode = ((int) (0) );
		//line 39 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.quality = 11;
		//line 40 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.lgwin = 22;
		//line 41 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.lgblock = 0;
		//line 42 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.enable_dictionary = true;
		//line 43 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.enable_transforms = false;
		//line 44 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.greedy_block_split = false;
		//line 45 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		__hx_this.enable_context_modeling = true;
	}
	
	
	public int mode;
	
	public int quality;
	
	public int lgwin;
	
	public int lgblock;
	
	public boolean enable_dictionary;
	
	public boolean enable_transforms;
	
	public boolean greedy_block_split;
	
	public boolean enable_context_modeling;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		{
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			switch (field.hashCode())
			{
				case 108784626:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgblock")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.lgblock = ((int) (value) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 3357091:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("mode")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.mode = ((int) (value) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 102926465:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgwin")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.lgwin = ((int) (value) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 651215103:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("quality")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.quality = ((int) (value) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
			}
			
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		{
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			switch (field.hashCode())
			{
				case 2108810213:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_context_modeling")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.enable_context_modeling = haxe.lang.Runtime.toBool(value);
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 3357091:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("mode")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.mode = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case -1894095927:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("greedy_block_split")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.greedy_block_split = haxe.lang.Runtime.toBool(value);
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 651215103:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("quality")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.quality = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case -989416765:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_transforms")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.enable_transforms = haxe.lang.Runtime.toBool(value);
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 102926465:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgwin")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.lgwin = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 1184702674:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_dictionary")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.enable_dictionary = haxe.lang.Runtime.toBool(value);
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 108784626:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgblock")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						this.lgblock = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return value;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
			}
			
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		{
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			switch (field.hashCode())
			{
				case 2108810213:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_context_modeling")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.enable_context_modeling;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 3357091:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("mode")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.mode;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case -1894095927:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("greedy_block_split")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.greedy_block_split;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 651215103:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("quality")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.quality;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case -989416765:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_transforms")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.enable_transforms;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 102926465:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgwin")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.lgwin;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 1184702674:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("enable_dictionary")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.enable_dictionary;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 108784626:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgblock")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return this.lgblock;
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
			}
			
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		{
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			switch (field.hashCode())
			{
				case 108784626:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgblock")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return ((double) (this.lgblock) );
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 3357091:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("mode")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return ((double) (this.mode) );
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 102926465:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("lgwin")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return ((double) (this.lgwin) );
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
				case 651215103:
				{
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					if (field.equals("quality")) 
					{
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						__temp_executeDef1 = false;
						//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
						return ((double) (this.quality) );
					}
					
					//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
					break;
				}
				
				
			}
			
			//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("enable_context_modeling");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("greedy_block_split");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("enable_transforms");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("enable_dictionary");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("lgblock");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("lgwin");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("quality");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		baseArr.push("mode");
		//line 17 "C:\\Users\\Dominik\\Brotli\\src\\encode\\encode\\BrotliParams.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


