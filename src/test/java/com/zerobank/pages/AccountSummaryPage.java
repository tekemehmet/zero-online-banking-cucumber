package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends AbstractPageBase {





    public List<String> getPageHeaderName(){

        List<WebElement> headerNames = driver.findElements(By.xpath("//div[@class='offset2 span8']/h2"));
        List<String> headerNamesText = new ArrayList<>();
        for (WebElement headerName : headerNames){

            headerNamesText.add(headerName.getText());
        }
        return headerNamesText;
    }



    public List<String> getTableColumnNames() {

        List<WebElement> columnNames = driver.findElements(By.xpath("(//table)[3]//th"));
        List<String> columnNamesText = new ArrayList<>();
        for (WebElement columnName : columnNames) {

            columnNamesText.add(columnName.getText());

        }
        return columnNamesText;

    }

}
