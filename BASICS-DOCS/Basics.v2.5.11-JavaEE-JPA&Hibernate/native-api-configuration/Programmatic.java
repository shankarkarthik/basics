/**
 * Specifying the mapping files directly
 * You can obtain a org.hibernate.cfg.Configuration instance by instantiating it directly and specifying XML mapping documents. If the mapping files are in the classpath, use method addResource().
 */
Configuration cfg = new Configuration()
    .addResource("Item.hbm.xml")
    .addResource("Bid.hbm.xml");

/**
 * Letting Hibernate find the mapping files for you
 * The addClass() method directs Hibernate to search the CLASSPATH for the mapping files, eliminating hard-coded file names. In the following example, it searches for org/hibernate/auction/Item.hbm.xml and org/hibernate/auction/Bid.hbm.xml.
 */

Configuration cfg = new Configuration()
    .addClass(org.hibernate.auction.Item.class)
    .addClass(org.hibernate.auction.Bid.class);

/**
 * Specifying configuration properties
 */
Configuration cfg = new Configuration()
    .addClass(org.hibernate.auction.Item.class)
    .addClass(org.hibernate.auction.Bid.class)
    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLInnoDBDialect")
    .setProperty("hibernate.connection.datasource", "java:comp/env/jdbc/test")
    .setProperty("hibernate.order_updates", "true");

/**
 * Other ways to configure Hibernate programmatically
 * Pass an instance of java.util.Properties to Configuration.setProperties().
 * Set System properties using java -Dproperty=value
 */


