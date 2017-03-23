package co.com.cfn.foundation.framework.components.interfaces;


import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

public interface Builder<O> {

    O build() throws InfrastructureException;

}
