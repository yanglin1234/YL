package cn.com.log;


import java.util.logging.Logger;

/**
 * Created by lin.yang on 2017-09-06.
 */
public class logTest {
 // static   org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(String.valueOf(new logTest()));
    private static final Logger LOGGER = Logger.getLogger("logTest.class");
    public static void main(String[] args) {
        LOGGER.warning("mmm");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");LOGGER.info("3344444444444443");
    }
}
