package study20250112;

public class Method2 {

	public static void main(String[] args) {
		
		Vanding orange = new Vanding("쌕쌕 오렌지", 1500, 4);
		Vanding top = new Vanding("Top 블랙", 2700, 3);
		
		System.out.println( orange);		
		System.out.println( top );
		
		
		orange.buy(2000);
		System.out.println( orange );
		top.buy(2000);
		System.out.println( top );
	}

}
