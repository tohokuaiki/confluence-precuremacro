/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.junoe.confluence.plugins.precure.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Takashi
 */
public class Heading implements Macro{

    @Override
    public String execute(Map<String, String> params, String body, ConversionContext context) throws MacroExecutionException {
        String serise = params.get("series");
        if (StringUtils.isEmpty(serise)){
            serise = "MaxHeart";
        }
        return "<div class=\"precure-heading ph-"+ serise +"\">" + body + "</div>";
    }

    @Override
    public BodyType getBodyType() {
        return BodyType.RICH_TEXT;        
    }

    @Override
    public OutputType getOutputType() {
        return OutputType.BLOCK;
    }
    
}
