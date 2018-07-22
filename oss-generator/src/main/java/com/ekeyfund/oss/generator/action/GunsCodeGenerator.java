package com.ekeyfund.oss.generator.action;


import com.ekeyfund.oss.generator.action.config.GunsGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author ekeyfund
 * @Date 2017/5/21 12:38
 */
public class GunsCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        GunsGeneratorConfig gunsGeneratorConfig = new GunsGeneratorConfig();
        gunsGeneratorConfig.doMpGeneration();

        /**
         * guns的生成器:
         *      guns的代码生成器可以生成controller,html页面,页面对应的js
         */
        gunsGeneratorConfig.doGunsGeneration();
    }

}