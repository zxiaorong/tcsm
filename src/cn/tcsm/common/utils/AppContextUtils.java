package cn.tcsm.common.utils;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Ӧ�������Ĺ���
 *
 * @author Brendan Lee
 */
public class AppContextUtils {
    /**
     * Servlet �����Ķ���
     */
    private static final ServletContext SERVLET_CONTEXT = ContextLoader
            .getCurrentWebApplicationContext().getServletContext();

    /**
     * Ӧ�ø�·��
     */
    private static String rootPath;

    /**
     * ��·��
     */
    private static String classpath;

    static {
        // ��ȡ����ʽ�� rootPath
        rootPath = formatDirPath(SERVLET_CONTEXT.getRealPath("/"));

        // ��ȡ����ʽ�� classpath
        try {
            URL rootUrl = AppContextUtils.class.getClassLoader().getResource("");
            if (rootUrl != null) {
                classpath = formatDirPath(URLDecoder.decode(rootUrl.getPath(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ȡ��ǰ�Ự�� session ����
     *
     * @return ��ǰ�Ự�� session ����
     */
    public static HttpSession getSession() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest().getSession();
    }

    /**
     * ��ȡ Servlet Context ����
     *
     * @return Servlet Context ����
     */
    public static ServletContext getServletContext() {
        return SERVLET_CONTEXT;
    }

    /**
     * ����ָ�������·������ȡ�������Ӧ�ø�Ŀ¼�ľ���·��
     * <p>
     * ע������ Classpath��Classpath �����ļ��Ĵ洢·������ WebAPP ��ͨ��ΪӦ�ø�·���µ� WEB-INF/classes/
     *
     * @param relativePath �����Ӧ�ø�Ŀ¼��·��
     * @return ��Դ����·��
     */
    public static String getPath(String relativePath) {
        relativePath = formatPath(relativePath);
        return rootPath + relativePath;
    }

    /**
     * ����ָ�������·������ȡ������� Classpath �ľ���·��
     * <p>
     * ע������Ӧ�ø�·����Ӧ�ø�·��������Ӧ�ó���ĸ�·������ WebAPP �� Classpath ͨ��Ϊ���µ� WEB-INF/classes/
     *
     * @param relativePath ����� Classpath ��·��
     * @return ��Դ�ľ���·��
     */
    public static String getClasspath(String relativePath) {
        relativePath = formatPath(relativePath);
        return classpath + relativePath;
    }

    /**
     * ��ʽ��·��
     * <p>
     * ʹ��б�ߣ�Forward Slash����Ϊ·���ָ�����ȥ��·����ͷ��б��
     *
     * @param path ·��
     * @return ��ʽ�����·��
     */
    private static String formatPath(String path) {
        // �滻��б��Ϊб��
        path = path.replace('\\', '/');

        // ȥ����ͷ��б��
        path = !path.isEmpty() && path.charAt(0) == '/' ? path.substring(1) : path;

        return path;
    }

    /**
     * ��ʽ���ļ���·��
     * <p>
     * ʹ��б�ߣ�Forward Slash����Ϊ·���ָ�����ȥ��·����ͷ��б�ߣ���ӽ�β��б��
     *
     * @param dirPath �ļ���·��
     * @return ��ʽ�����·��
     */
    private static String formatDirPath(String dirPath) {
        dirPath = formatPath(dirPath);

        // ��ӽ�β��б��
        dirPath += !dirPath.isEmpty() && dirPath.charAt(dirPath.length() - 1) == '/' ? "" : '/';

        return dirPath;
    }
}
