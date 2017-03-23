package co.com.cfn.foundation.framework.components.builder;


import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

public interface Mapper<I, O> {

    O map(I input) throws InfrastructureException;

}
