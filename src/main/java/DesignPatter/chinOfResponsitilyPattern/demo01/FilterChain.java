package main.java.DesignPatter.chinOfResponsitilyPattern.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:49
 * @Version 1.0
 * @date 2019-11-29 09:54
 * @author wangzhilei
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public void doFilter() {
        for (Filter filter : this.filters) {
            filter.doFilter();
        }
    }
}
