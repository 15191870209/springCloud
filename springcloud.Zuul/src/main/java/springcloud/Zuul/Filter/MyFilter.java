package springcloud.Zuul.Filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
//服务过滤
@Component
public class MyFilter extends ZuulFilter {
	 private static Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public Object run() throws ZuulException {		
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object name=request.getParameter("name");
        System.out.println(name);
        if(name==null){
        	log.warn("name is null");
        	ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);//输入的信息无效
            return null;
        }
        log.info(name.toString());
		return null;
	}
	//逻辑判断，是否过滤
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	//pre：路由之前 routing：路由之时 post： 路由之后 error：发送错误调用
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
