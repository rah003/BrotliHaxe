// Generated by Haxe 3.4.0
package encode.brotli_bit_stream;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BlockSplitCode extends haxe.lang.HxObject
{
	public BlockSplitCode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BlockSplitCode()
	{
		//line 11 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		encode.brotli_bit_stream.BlockSplitCode.__hx_ctor_encode_brotli_bit_stream_BlockSplitCode(this);
	}
	
	
	public static void __hx_ctor_encode_brotli_bit_stream_BlockSplitCode(encode.brotli_bit_stream.BlockSplitCode __hx_this)
	{
	}
	
	
	public int[] type_code;
	
	public int[] length_prefix;
	
	public int[] length_nextra;
	
	public int[] length_extra;
	
	public int[] type_depths;
	
	public int[] type_bits;
	
	public int[] length_depths;
	
	public int[] length_bits;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		{
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			switch (field.hashCode())
			{
				case 1638499007:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_bits")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.length_bits = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 518867922:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_code")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.type_code = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1602002551:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_depths")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.length_depths = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1246788085:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_prefix")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.length_prefix = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 518832875:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_bits")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.type_bits = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1315472421:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_nextra")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.length_nextra = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 435635893:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_depths")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.type_depths = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -742920841:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_extra")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						this.length_extra = ((int[]) (value) );
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return value;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
			}
			
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		{
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			switch (field.hashCode())
			{
				case 1638499007:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_bits")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.length_bits;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 518867922:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_code")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.type_code;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1602002551:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_depths")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.length_depths;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1246788085:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_prefix")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.length_prefix;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 518832875:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_bits")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.type_bits;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -1315472421:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_nextra")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.length_nextra;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case 435635893:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("type_depths")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.type_depths;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
				case -742920841:
				{
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					if (field.equals("length_extra")) 
					{
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						__temp_executeDef1 = false;
						//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
						return this.length_extra;
					}
					
					//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
					break;
				}
				
				
			}
			
			//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("length_bits");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("length_depths");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("type_bits");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("type_depths");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("length_extra");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("length_nextra");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("length_prefix");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		baseArr.push("type_code");
		//line 8 "C:\\Users\\Dominik\\Brotli\\src\\encode\\brotli_bit_stream\\BlockSplitCode.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


