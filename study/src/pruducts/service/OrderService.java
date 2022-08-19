
package pruducts.service;

import java.util.ArrayList;


import product.dto.OrderRespDto;

public interface OrderService {
	public void 주문하기(int customerid, int productid);
	public void 주문취소하기(int id);
	public ArrayList<OrderRespDto> 고객별주문목록보기(int customerid);

}
