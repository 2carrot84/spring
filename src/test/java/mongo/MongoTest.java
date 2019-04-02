package mongo;

import com.ecarrot.domain.Sku;
import com.ecarrot.repository.SkuRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class MongoTest {

    @Autowired
    SkuRepository repository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void countTest() {
        System.out.println("countTest : " + repository.count());
    }
//
//    @Test
//    public void findOneTest() {
//        String query = "{ \"str_code\" : 9775, \"sku_code\" : 2091000130936 }";
////        query.put("str_code", 9775L);
////        query.put("sku_code", 2091000130936L);
//
//        System.out.println("findOneTest : " + repository.findOne(query));
//
//    }

    @Test
    public void getSkuInfo() {
        Query query = new Query();
        query.addCriteria(Criteria.where("strCode").is(Long.parseLong("1016")));
        query.addCriteria(Criteria.where("skuCode").is(Long.parseLong("8808742041280")));

        Sku sku = mongoTemplate.findOne(query, Sku.class, "sku");
        System.out.println("getSkuInfo : " + sku);
    }

    @Test
    public void findBySkuCodeAndStrCodeTest() {
        System.out.println("find by : " + repository.findBySkuCodeAndStrCode(Long.parseLong("8808742041280"), Long.parseLong("1084")));
    }

    @Test
    public void findAllByStrCode() {
        List<Sku> skus = repository.findByStrCodeAndGCodeAndMCode(Long.parseLong("1084"), Long.parseLong("621"), Long.parseLong("4870"));

        for (Sku sku: skus) {
            System.out.println("sku : " + sku.toString());
        }
    }
}
