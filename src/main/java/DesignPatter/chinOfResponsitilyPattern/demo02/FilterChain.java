package main.java.DesignPatter.chinOfResponsitilyPattern.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2019/11/29 9:49
 * @Version 1.0
 * @date 2019-11-29 09:54
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter() {
        for (Filter filter : this.filters) {
            boolean b = filter.doFilter();
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
